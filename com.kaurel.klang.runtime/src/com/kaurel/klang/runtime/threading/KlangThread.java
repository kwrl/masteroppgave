package com.kaurel.klang.runtime.threading;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import klang.AbstractActor;
import klangexpr.Statement;

public class KlangThread {
	private final AbstractActor<?> actor;
	private final LinkedList<Statement> queue;

	public KlangThread(EList<Statement> statements, AbstractActor<?> actor) {
		this((List<Statement>)statements, actor);
	}
	
	public KlangThread(List<Statement> statements, AbstractActor<?> actor) {
		this.actor = actor;
		this.queue = new LinkedList<>(statements);
	}

	public AbstractActor<?> getActor() {
		return actor;
	}

	public void addFirst(Statement statement) {
		queue.addFirst(statement);
	}
	
	public void addLast(Statement statement) {
		queue.addLast(statement);
	}
	
	public void addAllLast(List<Statement> statements) {
		queue.addAll(statements);
	}
	
	public void addAllFirst(List<Statement> statements) {
		queue.addAll(0, statements);
	}
	
	public Statement poll() {
		return queue.poll();
	}

	public boolean isDone() {
		return queue.isEmpty();
	}
}
