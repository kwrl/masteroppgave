package com.kaurel.kengine;

import java.io.IOException;
import java.net.URL;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.jbox2d.callbacks.ContactImpulse;
import org.jbox2d.callbacks.ContactListener;
import org.jbox2d.collision.Manifold;
import org.jbox2d.collision.shapes.MassData;
import org.jbox2d.collision.shapes.Shape;
import org.jbox2d.common.Vec2;
import org.jbox2d.dynamics.Body;
import org.jbox2d.dynamics.BodyDef;
import org.jbox2d.dynamics.FixtureDef;
import org.jbox2d.dynamics.World;
import org.jbox2d.dynamics.contacts.Contact;

import fxmlbox2d.BodyDefBeanMapper;
import fxmlbox2d.DefaultShapeMapper;
import fxmlbox2d.FixtureDefBeanMapper;
import fxmlbox2d.GeometryHelper;
import fxmlbox2d.INodeMapper;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public abstract class Box2dApplication extends Application implements ContactListener {
	protected Group root;
	protected Scene scene;

	protected double fxWorldScale;

	protected GeometryHelper geometryHelper;
	protected INodeMapper<BodyDef> nodeBodyMapper;
	protected INodeMapper<FixtureDef> nodeFixtureMapper;
	protected INodeMapper<Shape> nodeShapeMapper;
	protected Map<Body, Node> bodyNodeMapping;

	protected BooleanProperty running = new SimpleBooleanProperty(false);
	protected Set<KeyCode> keysDown = new HashSet<>();
	protected Set<UnorderedPair<Body>> collisions = new HashSet<>();

	protected World world;

	protected Deque<Runnable> tickTasks = new ConcurrentLinkedDeque<Runnable>();
	protected Deque<Runnable> frameTasks = new ConcurrentLinkedDeque<Runnable>();

	private Set<GameEventListener> eventListeners = new HashSet<>();

	protected int tickRate = 60;

	protected TimerTask tickTimerTask = new TimerTask() {
		@Override
		public void run() {
			for (Runnable task : tickTasks) {
				task.run();
			}
			world.step(0.05f, 5, 5);
		}
	};

	protected AnimationTimer frameTimer = new AnimationTimer() {
		@Override
		public void handle(long now) {
			for (Runnable task : frameTasks) {
				task.run();
			}
			updateBodyNodes();
		}
	};

	protected Timer tickTimer = new Timer(true);

	@FXML
	protected Region worldParent;

	@Override
	public void start(Stage primaryStage) throws Exception {
		scene = start((Scene) null);
		primaryStage.setScene(scene);
		primaryStage.show();

		initializeWorld();

		frameTimer.start();
		tickTimer.scheduleAtFixedRate(tickTimerTask, 0, 1000 / tickRate);

		createEventMapping();
	}

	public Scene start(Scene scene) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getFXMLResource());
		fxmlLoader.setController(this);
		Parent root = (Parent) fxmlLoader.load();
		if (scene == null) {
			scene = new Scene(root);
		} else {
			scene.setRoot(root);
		}
		return scene;
	}

	private void createEventMapping() {
		scene.setOnKeyPressed(new javafx.event.EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (!keysDown.contains(event.getCode())) {
					keysDown.add(event.getCode());
					eventListeners.stream().forEach(l -> l.onKeyPressed(event.getCode().toString()));
				}
			}
		});

		scene.setOnKeyReleased(new javafx.event.EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				if (keysDown.contains(event.getCode())) {
					keysDown.remove(event.getCode());
				}
			}
		});

		running.addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if (newValue) {
					eventListeners.stream().forEach(l -> l.onGameStart());
				} else {
					eventListeners.stream().forEach(l -> l.onGameStopped());
				}
			}
		});

		scene.setOnMouseMoved(new javafx.event.EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
			}
		});
		
		bodyNodeMapping.entrySet().stream().forEach(e -> e.getValue().setOnMouseClicked(
				new javafx.event.EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						eventListeners.stream().forEach(l -> l.onBodyClicked(e.getKey()));
					}
				}
		));
	}

	protected void updateBodyNodes() {
		MassData massData = new MassData();
		for (Body body : bodyNodeMapping.keySet()) {
			Node node = bodyNodeMapping.get(body);
			body.getMassData(massData);
			float width, height;
			width = (float) node.getBoundsInLocal().getWidth();
			height = (float) node.getBoundsInLocal().getHeight();
			//float dx = massData.center.x, dy = massData.center.y;
			Point2D nodePosition = geometryHelper.mrofsnart(body.getPosition().x, body.getPosition().y, node);
			node.relocate(nodePosition.getX() - width / 2, nodePosition.getY() - height / 2);
			node.setRotate((-body.getAngle() * 180 / Math.PI) % 360);
		}
	}

	private void initializeWorld() {
		fxWorldScale = 1d;
		geometryHelper = new GeometryHelper(worldParent, worldParent.getPrefHeight(), fxWorldScale);
		nodeBodyMapper = new BodyDefBeanMapper();
		nodeFixtureMapper = new FixtureDefBeanMapper();
		nodeShapeMapper = new DefaultShapeMapper(geometryHelper);
		createWorld();
	}

	private void createWorld() {
		world = new World(new Vec2(0.0f, -10.0f));
		world.setContactListener(this);
		bodyNodeMapping = new HashMap<>();
		MassData massData = new MassData();
		for (Node child : worldParent.getChildrenUnmodifiable()) {
			float width = (float) child.getBoundsInLocal().getWidth();
			float height = (float) child.getBoundsInLocal().getHeight();
			BodyDef bodyDef = nodeBodyMapper.create(child);
			if (bodyDef != null) {
				double childX = child.getLayoutX(), childY = child.getLayoutY();

				Point2D bodyPosition = geometryHelper.transform(childX + width / 2, childY + height / 2, child);
				bodyDef.position.set((float) bodyPosition.getX(), (float) bodyPosition.getY());
				Body body = world.createBody(bodyDef);
				bodyNodeMapping.put(body, child);
				if (child instanceof Parent) {
					Iterable<Node> bodyChildren = ((Parent) child).getChildrenUnmodifiable();
					int fixtureCount = 0;
					for (Node bodyChild : bodyChildren) {
						FixtureDef fixtureDef = nodeFixtureMapper.create(bodyChild);
						if (fixtureDef != null) {
							Shape shape = nodeShapeMapper.create(bodyChild);
							if (shape != null) {
								fixtureDef.shape = shape;
								body.createFixture(fixtureDef);
								fixtureCount++;
							}
						}
					}
					if (fixtureCount > 0) {
						body.getMassData(massData);
						float dx = (float) (massData.center.x / fxWorldScale),
								dy = -(float) (massData.center.y / fxWorldScale);
						child.setLayoutX(childX + dx);
						child.setLayoutY(childY + dy);
						for (Node bodyChild : bodyChildren) {
							bodyChild.setLayoutX(bodyChild.getLayoutX() - dx);
							bodyChild.setLayoutY(bodyChild.getLayoutY() - dy);
						}
					} else {
						world.destroyBody(body);
					}
				}
			}
		}
	}

	public URL getFXMLResource() {
		return getClass().getResource("test.fxml");
	}

	@Override
	public void beginContact(Contact contact) {
		eventListeners.stream().forEach(l -> l.onCollision(contact.m_fixtureA.m_body, contact.m_fixtureB.m_body));
		collisions.add(new UnorderedPair<Body>(contact.m_fixtureA.m_body, contact.m_fixtureB.m_body));
	}

	@Override
	public void endContact(Contact contact) {
		collisions.remove(new UnorderedPair<Body>(contact.m_fixtureA.m_body, contact.m_fixtureB.m_body));
	}

	@Override
	public void preSolve(Contact contact, Manifold oldManifold) {
		// TODO Auto-generated method stub

	}

	@Override
	public void postSolve(Contact contact, ContactImpulse impulse) {

	}

	public void addGameEventListener(GameEventListener listener) {
		eventListeners.add(listener);
	}
}
