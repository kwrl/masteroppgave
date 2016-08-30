package com.kaurel.klang.runtime.threading;

import java.util.LinkedList;

import org.eclipse.emf.common.util.EList;

import com.kaurel.klang.runtime.ExpressionEvaluator;
import com.kaurel.klang.runtime.ExpressionEvaluatorImpl;

import klang.AbstractActor;
import klang.Expression;
import klang.ForeverLoop;
import klang.If;
import klang.KlangFactory;
import klang.Sleep;
import klang.Statement;
import klang.VariableAssignment;
import klang.VariableDeclaration;
import klang.WhileLoop;
import klang.Yield;
import klang.util.KlangSwitch;

public class KlangThread extends KlangSwitch<Object> {
	private final ExpressionEvaluator expressionEvaluator;
	private final AbstractActor actor;

	private LinkedList<Statement> queue;

	public KlangThread(EList<Statement> statements, AbstractActor actor) {
		this.actor = actor;
		this.expressionEvaluator = new ExpressionEvaluatorImpl(actor);
		this.queue = new LinkedList<>(statements);
	}

	public ThreadStatus step() {
		Statement current = queue.poll();

		if (current == null) {
			return new TerminateStatus(this);
		}
		
		if (current instanceof Yield) {
			return new YieldStatus(this);
		}

		if (current instanceof Sleep) {
			return new SleepStatus(this, (int) ((Sleep) current).getDuration() * 1000);
		}

		doSwitch(current);

		return new RunningStatus(this);
	}

	// Step until thread requests otherwise(sleep/yield/terminate)
	public ThreadStatus run() {
		ThreadStatus status = step();

		while (status instanceof RunningStatus) {
			status = step();
		}

		return status;
	}

	@Override
	public Void caseVariableDeclaration(VariableDeclaration object) {
		object.setValue(expressionEvaluator.evaluate(object.getExpression()));
		return null;
	}

	@Override
	public Void caseWhileLoop(WhileLoop object) {
		if (expressionEvaluator.evaluateBoolean(object.getPredicate())) {
			queue.addFirst(object);
			queue.addFirst(KlangFactory.eINSTANCE.createYield());
			queue.addAll(0, object.getLoopBlock());
		}
		return null;
	}

	@Override
	public Void caseForeverLoop(ForeverLoop object) {
		queue.addFirst(object);
		queue.addFirst(KlangFactory.eINSTANCE.createYield());
		queue.addAll(0, object.getLoopStatements());
		return null;
	}

	@Override
	public Void caseIf(If object) {
		if (expressionEvaluator.evaluateBoolean(object.getPredicate())) {
			queue.addAll(0, object.getIfBlock());
		} else {
			queue.addAll(0, object.getElseBlock());
		}
		return null;
	}

	@Override
	public Void caseVariableAssignment(VariableAssignment object) {
		if (actor.isInScope(object.getVariableName())) {
			actor.getVariableDeclaration(object.getVariableName())
					.setValue(expressionEvaluator.evaluate(object.getExpression()));
		}
		return null;
	}
	
	@Override
	public Object caseExpression(Expression object) {
		return expressionEvaluator.evaluate(object);
	}

	public boolean isDone() {
		return queue.isEmpty();
	}
}
