package com.kaurel.klang.runtime;

import java.util.stream.Stream;

import com.kaurel.klang.runtime.threading.KlangScheduler;

import klang.Entity;
import klang.EventHandler;
import klang.Game;

public class KlangInterpreter {
	private KlangScheduler scheduler = new KlangScheduler();
	private Game game;

	public KlangInterpreter(Game game) {
		this.game = game;

		// Initialize variables
		KlangExpressionEvaluator evaluator = new KlangExpressionEvaluatorImpl();
		game.getGlobalVariables().stream()
				.forEach(v -> v.setValue(evaluator.evaluate(v.getExpression())));

		game.getActors().stream()
				.flatMap(a -> a.getVariableDeclarations().stream())
				.forEach(v -> v.setValue(evaluator.evaluate(v.getExpression())));
	}

	public void triggerEvent(Entity entity, Class<? extends EventHandler> type) {
		entity.getActor()
				.getEventHandlers()
				.stream()
				.filter(e -> type.isInstance(e))
				.forEach(e -> scheduler.processEventHandler(e));
	}

	public void triggerEvent(Class<? extends EventHandler> type) {
		game.getActors().stream()
				.flatMap(a -> a.getEventHandlers().stream())
				.filter(e -> type.isInstance(e))
				.forEach(e -> scheduler.processEventHandler(e));
	}

	public Stream<Entity> getEntities() {
		return game.getAllEntities().stream();
	}
	
	public boolean isIdle() {
		return scheduler.isIdle();
	}

	public void tick() {
		scheduler.tick();
	}
}
