package com.kaurel.klang.runtime;

import com.kaurel.klang.runtime.threading.KlangScheduler;

import klang.Entity;
import klang.EventHandler;
import klang.SceneActor;
import klang.VariableDeclaration;

public class KlangInterpreter {
	private KlangScheduler scheduler = new KlangScheduler();
	private SceneActor sceneActor;

	public KlangInterpreter(SceneActor sceneActor) {
		this.sceneActor = sceneActor;
		
		// Initialize variables
		ExpressionEvaluator evaluator = new ExpressionEvaluatorImpl(sceneActor);
		sceneActor.getLocalVariables().stream()
				.forEach(v -> v.setValue(evaluator.evaluate(v.getExpression())));

		sceneActor.getChildren().stream()
				.flatMap(a -> a.getLocalVariables().stream())
				.forEach(v -> v.setValue(evaluator.evaluate(v.getExpression())));
		
		sceneActor.getChildren().stream()
			.forEach(a -> {
				ExpressionEvaluator eval = new ExpressionEvaluatorImpl(a);
				for(VariableDeclaration var : a.getLocalVariables()) {
					var.setValue(eval.evaluate(var.getExpression()));
				}
			});
	}

	public void triggerEvent(Entity entity, Class<? extends EventHandler> type) {
		entity.getActor()
				.getEventHandlers()
				.stream()
				.filter(e -> type.isInstance(e))
				.forEach(e -> scheduler.processEventHandler(e));
	}

	public void triggerEvent(Class<? extends EventHandler> type) {
		sceneActor.getSubtree().stream()
				.flatMap(a -> a.getEventHandlers().stream())
				.filter(e -> type.isInstance(e))
				.forEach(e -> scheduler.processEventHandler(e));
	}

	public boolean isIdle() {
		return scheduler.isIdle();
	}

	public void tick() {
		scheduler.tick();
	}
}
