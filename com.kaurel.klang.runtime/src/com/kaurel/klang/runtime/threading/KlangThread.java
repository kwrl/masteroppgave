package com.kaurel.klang.runtime.threading;

import java.util.LinkedList;
import java.util.List;

import com.kaurel.klang.runtime.KlangExpressionEvaluator;
import com.kaurel.klang.runtime.KlangExpressionEvaluatorImpl;

import klang.AbstractElement;
import klang.Expression;
import klang.ForeverLoop;
import klang.If;
import klang.KlangFactory;
import klang.Sleep;
import klang.Variable;
import klang.VariableAssignment;
import klang.WhileLoop;
import klang.Yield;
import klang.util.KlangSwitch;

public class KlangThread extends KlangSwitch<Object> {
	private KlangExpressionEvaluator expressionEvaluator = new KlangExpressionEvaluatorImpl();
	private LinkedList<AbstractElement> queue;

	public KlangThread(List<AbstractElement> statements) {
		this.queue = new LinkedList<>(statements);
	}

	public ThreadStatus step() {
		AbstractElement current = queue.poll();

		if (current == null) {
			return new TerminateStatus(this);
		}

		if (current instanceof Yield) {
			return new YieldStatus(this);
		}

		if (current instanceof Sleep) {
			return new SleepStatus(this, (int)((Sleep) current).getDuration()*1000);
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
	public Void caseVariable(Variable object) {
		object.setValue(expressionEvaluator.evaluate(object.getExpression()));
		return null;
	}

	@Override
	public Void caseWhileLoop(WhileLoop object) {
		if (expressionEvaluator.evaluateBoolean(object.getPredicate())) {
			queue.addFirst(KlangFactory.eINSTANCE.createYield());
			queue.addAll(0, object.getLoopBlock());
			queue.addLast(object);
		}
		return null;
	}

	@Override
	public Void caseForeverLoop(ForeverLoop object) {
		queue.addFirst(KlangFactory.eINSTANCE.createYield());
		queue.addAll(0, object.getLoopStatements());
		queue.addLast(object);
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
		object.getVariable().setValue(expressionEvaluator.evaluate(object.getExpression()));
		return null;
	}

	// Pass all expressions on to evaluator
	@Override
	public Object caseExpression(Expression object) {
		expressionEvaluator.evaluate(object);
		return super.caseExpression(object);
	}

	public boolean isDone() {
		return queue.isEmpty();
	}
}
