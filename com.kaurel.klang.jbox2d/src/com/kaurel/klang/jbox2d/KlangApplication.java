package com.kaurel.klang.jbox2d;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.util.Diagnostician;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.World;

import com.kaurel.klang.jbox2d.entities.EntityImpl;
import com.kaurel.klang.jbox2d.entities.SceneEntityImpl;
import com.kaurel.klang.jbox2d.entities.SpriteEntityImpl;
import com.kaurel.klang.jbox2d.events.JavaFXKeyCodeMapping;
import com.kaurel.klang.runtime.KlangInterpreter;
import com.kaurel.klang.runtime.ProgramParser;

import example.JBox2dApp;
import fxmlbox2d.DefaultNodeBody;
import fxmlbox2d.GeometryHelper;
import fxmlbox2d.INodeBody;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import klang.ClickEvent;
import klang.KeyPressEvent;
import klang.KlangFactory;
import klang.Program;
import klang.SceneActor;
import klang.SpriteActor;
import klang.entities.SpriteEntity;

public class KlangApplication extends JBox2dApp implements KlangApp {

	private static KlangApplication INSTANCE;

	private KlangInterpreter interpreter;
	private Program program;
	private Stage stage;

	private Map<INodeBody<Node>, EntityImpl> nodeBodyEntityMapping = new HashMap<>();

	public KlangApplication() {
		if (INSTANCE == null) {
			INSTANCE = this;
		}
	}

	public static KlangApp getInstance() {
		return INSTANCE;
	}

	@Override
	public void start(Stage stage) throws IOException {
		super.start(stage);
		this.stage = stage;
		stage.setResizable(false);
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

		interpreter.getEventRegistry().fireEvent(KlangFactory.eINSTANCE.createGameStartEvent());

		interpreter.getActors(SpriteActor.class)
				.filter(a -> getNodeBody(a.getName()).isPresent())
				.forEach(a -> {
					INodeBody<Node> nodeBody = getNodeBody(a.getName()).get();
					EntityImpl entity = new SpriteEntityImpl(a, nodeBody);
					a.setSubject((SpriteEntity) entity);
					nodeBodyEntityMapping.put(nodeBody, entity);
				});

		interpreter.getActors(SceneActor.class)
				.forEach(a -> a.setSubject(new SceneEntityImpl(program.getSceneActor(),
						new DefaultNodeBody<Node>(stage.getScene().getRoot(), null))));
	}

	private Vec2 mousePosition = new Vec2();

	private void createEventBindings() {
		// Map JavaFX key events to klang key events
		stage.getScene().addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				KeyPressEvent evt = KlangFactory.eINSTANCE.createKeyPressEvent();
				evt.setKey(JavaFXKeyCodeMapping.toKlangCode(event.getCode()));
				interpreter.getEventRegistry().fireEvent(evt);
			}
		});

		getNodeBodies()
				.stream()
				.filter(nb -> nodeBodyEntityMapping.containsKey(nb))
				.forEach(nb -> nb.getNode().setOnMouseClicked(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						EntityImpl entity = nodeBodyEntityMapping.get(nb);
						ClickEvent evt = KlangFactory.eINSTANCE.createClickEvent();
						interpreter.getEventRegistry().fireEvent(evt, entity.getActor());
					}
				}));

		getRoot().setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				ClickEvent evt = KlangFactory.eINSTANCE.createClickEvent();
				interpreter.getEventRegistry().fireEvent(evt, program.getSceneActor());
			}
		});

		getScene().setOnMouseMoved(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				Point2D p = geometryHelper.fxPoint2world(event.getSceneX(), event.getSceneY(), getRoot());
				mousePosition.x = (float) p.getX();
				mousePosition.y = (float) p.getY();
			}
		});
	}

	@Override
	protected void handleCollision(INodeBody<Node> nodeA, INodeBody<Node> nodeB) {
		EntityImpl entityA, entityB;
		entityA = nodeBodyEntityMapping.get(nodeA);
		entityB = nodeBodyEntityMapping.get(nodeB);

		if (entityA != null && entityB != null) {
			klang.CollisionEvent evt1 = KlangFactory.eINSTANCE.createCollisionEvent();
			klang.CollisionEvent evt2 = KlangFactory.eINSTANCE.createCollisionEvent();
			evt1.setTarget((SpriteActor) entityA.getActor());
			evt2.setTarget((SpriteActor) entityB.getActor());
			interpreter.getEventRegistry().fireEvent(evt1, entityB.getActor());
			interpreter.getEventRegistry().fireEvent(evt2, entityA.getActor());
		}
	}

	private void initializeProgram() throws IOException {
		InputStream in = getClass().getResourceAsStream(getClass().getSimpleName() + ".klang");
		program = ProgramParser.INSTANCE.parseProgram(in);
		Diagnostician.INSTANCE.validate(program);

	}

	@Override
	protected World createWorldInstance() {
		return new World(new Vec2(0.0f, 0.0f));
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

	@Override
	public Parent getRoot() {
		return stage.getScene().getRoot();
	}

	@Override
	public Scene getScene() {
		return stage.getScene();
	}

	@Override
	public Double getMouseX() {
		return (double) mousePosition.x;
	}

	@Override
	public Double getMouseY() {
		return (double) mousePosition.y;
	}

	@Override
	protected double getScaling() {
		return 2.0;
	}

	@Override
	public GeometryHelper getGeometryHelper() {
		return geometryHelper;
	}

}
