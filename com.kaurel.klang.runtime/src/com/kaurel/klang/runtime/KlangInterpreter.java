package com.kaurel.klang.runtime;

import com.kaurel.klang.runtime.threading.KlangScheduler;

import klang.AbstractActor;
import klang.EventHandler;
import klang.SceneActor;
import klang.VariableDeclaration;

public class KlangInterpreter {
	private KlangScheduler scheduler = new KlangScheduler();
	private SceneActor sceneActor;

	public KlangInterpreter(SceneActor sceneActor) {
		this.sceneActor = sceneActor;
		
		for(AbstractActor actor : sceneActor.traverseBFS()) {
			ExpressionEvaluator evaluator = new ExpressionEvaluatorImpl(actor);
			for(VariableDeclaration varDecl : actor.getLocalVariables()) {
				Object value = evaluator.evaluate(varDecl.getExpression());
				varDecl.setValue(value);
			}
		}
	}

	public void triggerEvent(AbstractActor actor, Class<? extends EventHandler> type) {
		actor.getEventHandlers()
				.stream()
				.filter(e -> type.isInstance(e))
				.forEach(e -> scheduler.processEventHandler(e));
	}

	public void triggerEvent(Class<? extends EventHandler> type) {
		sceneActor.traverseBFS()
				.stream()
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
