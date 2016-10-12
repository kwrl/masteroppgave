package com.kaurel.klang.jbox2d;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.World;

import com.kaurel.klang.jbox2d.entities.Entity;
import com.kaurel.klang.jbox2d.entities.SceneEntity;
import com.kaurel.klang.jbox2d.entities.SpriteEntity;
import com.kaurel.klang.jbox2d.events.JavaFXKeyCodeMapping;
import com.kaurel.klang.runtime.KlangInterpreter;
import com.kaurel.klang.runtime.ProgramParser;
import com.kaurel.klang.runtime.events.ClickedEvent;
import com.kaurel.klang.runtime.events.CollisionEvent;
import com.kaurel.klang.runtime.events.KeyboardEvent;

import example.JBox2dApp;
import fxmlbox2d.INodeBody;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import klang.GameStart;
import klang.Program;
import klang.SceneActor;
import klang.SpriteActor;

public class KlangApplication extends JBox2dApp {
	private KlangInterpreter interpreter;
	private Program program;
	private Stage stage;

	private Map<INodeBody<Node>, Entity> nodeBodyEntityMapping = new HashMap<>();

	@Override
	public void start(Stage stage) throws IOException {
		super.start(stage);
		this.stage = stage;
	}

	@Override
	protected void configureWorld() {
		super.configureWorld();
		try {
			initializeProgram();
		} catch (IOException e) {
			e.printStackTrace();
		}
		interpreter = new KlangInterpreter(program.getSceneActor());
		createEventBindings();
		interpreter.triggerEvent(GameStart.class);
	}

	private void createEventBindings() {
		// Map JavaFX key events to klang key events
		stage.getScene().addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				interpreter.onKeyEvent(new KeyboardEvent(JavaFXKeyCodeMapping.toKlangCode(event.getCode())));
			}
		});

		getNodeBodies()
				.stream()
				.filter(nb -> nodeBodyEntityMapping.containsKey(nb))
				.forEach(nb -> nb.getNode().setOnMouseClicked(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						Entity entity = nodeBodyEntityMapping.get(nb);
						interpreter.onClicked(new ClickedEvent(entity.getActor()));
					}
				}));
	}
	
	@Override
	protected void handleCollision(INodeBody<Node> nodeA, INodeBody<Node> nodeB) {
		Entity entityA, entityB;
		entityA = nodeBodyEntityMapping.get(nodeA);
		entityB = nodeBodyEntityMapping.get(nodeB);
		
		if(entityA != null && entityB != null) {
			interpreter.onCollision(new CollisionEvent(entityA.getActor(), entityB.getActor()));
			interpreter.onCollision(new CollisionEvent(entityB.getActor(), entityA.getActor()));
		}
	}

	private void initializeProgram() throws IOException {
		InputStream in = getClass().getResourceAsStream(getClass().getSimpleName() + ".klang");
		program = ProgramParser.INSTANCE.parseProgram(in);

		program.getSceneActor()
				.traverseBFS()
				.stream()
				.filter(a -> getNodeBody(a.getName()).isPresent())
				.forEach(a -> {
					Optional<INodeBody<Node>> nodeBody = getNodeBody(a.getName());
					Entity entity;
					if (a instanceof SceneActor) {
						entity = new SceneEntity(a, nodeBody.get());
					} else if (a instanceof SpriteActor) {
						entity = new SpriteEntity(a, nodeBody.get());
					} else {
						entity = new Entity(a, nodeBody.get());
					}
					a.setSubject(entity);
					nodeBodyEntityMapping.put(nodeBody.get(), entity);
				});
	}

	@Override
	protected World createWorldInstance() {
		return new World(new Vec2(0.0f, -1.0f));
	}

	@Override
	public void tick(float dt) {
		interpreter.tick();
	}

	private Optional<INodeBody<Node>> getNodeBody(String name) {
		return getNodeBodies()
				.stream()
				.filter(nb -> nb != null && nb.getNode() != null && nb.getNode().getId() != null)
				.filter(nb -> nb.getNode().getId().equals(name))
				.findAny();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
