/**
 */
package klang.impl;

import java.util.Optional;
import java.util.stream.Stream;
import klang.*;
import klang.entities.Entity;
import klang.entities.SceneEntity;
import klang.entities.SpriteEntity;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KlangFactoryImpl extends EFactoryImpl implements KlangFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static KlangFactory init() {
		try {
			KlangFactory theKlangFactory = (KlangFactory)EPackage.Registry.INSTANCE.getEFactory(KlangPackage.eNS_URI);
			if (theKlangFactory != null) {
				return theKlangFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new KlangFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KlangFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case KlangPackage.SCENE_ACTOR: return createSceneActor();
			case KlangPackage.SPRITE_ACTOR: return createSpriteActor();
			case KlangPackage.EVENT_HANDLER: return createEventHandler();
			case KlangPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case KlangPackage.GAME_START_EVENT: return createGameStartEvent();
			case KlangPackage.CLICK_EVENT: return createClickEvent();
			case KlangPackage.KEY_PRESS_EVENT: return createKeyPressEvent();
			case KlangPackage.COLLISION_EVENT: return createCollisionEvent();
			case KlangPackage.PROGRAM: return createProgram();
			case KlangPackage.MESSAGE_RECEIVED_EVENT: return createMessageReceivedEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case KlangPackage.KEYS:
				return createKeysFromString(eDataType, initialValue);
			case KlangPackage.ENTITY:
				return createEntityFromString(eDataType, initialValue);
			case KlangPackage.SPRITE_ENTITY:
				return createSpriteEntityFromString(eDataType, initialValue);
			case KlangPackage.SCENE_ENTITY:
				return createSceneEntityFromString(eDataType, initialValue);
			case KlangPackage.OPTIONAL:
				return createOptionalFromString(eDataType, initialValue);
			case KlangPackage.STREAM:
				return createStreamFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case KlangPackage.KEYS:
				return convertKeysToString(eDataType, instanceValue);
			case KlangPackage.ENTITY:
				return convertEntityToString(eDataType, instanceValue);
			case KlangPackage.SPRITE_ENTITY:
				return convertSpriteEntityToString(eDataType, instanceValue);
			case KlangPackage.SCENE_ENTITY:
				return convertSceneEntityToString(eDataType, instanceValue);
			case KlangPackage.OPTIONAL:
				return convertOptionalToString(eDataType, instanceValue);
			case KlangPackage.STREAM:
				return convertStreamToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneActor createSceneActor() {
		SceneActorImpl sceneActor = new SceneActorImpl();
		return sceneActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpriteActor createSpriteActor() {
		SpriteActorImpl spriteActor = new SpriteActorImpl();
		return spriteActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandler createEventHandler() {
		EventHandlerImpl eventHandler = new EventHandlerImpl();
		return eventHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameStartEvent createGameStartEvent() {
		GameStartEventImpl gameStartEvent = new GameStartEventImpl();
		return gameStartEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClickEvent createClickEvent() {
		ClickEventImpl clickEvent = new ClickEventImpl();
		return clickEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyPressEvent createKeyPressEvent() {
		KeyPressEventImpl keyPressEvent = new KeyPressEventImpl();
		return keyPressEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollisionEvent createCollisionEvent() {
		CollisionEventImpl collisionEvent = new CollisionEventImpl();
		return collisionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageReceivedEvent createMessageReceivedEvent() {
		MessageReceivedEventImpl messageReceivedEvent = new MessageReceivedEventImpl();
		return messageReceivedEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Keys createKeysFromString(EDataType eDataType, String initialValue) {
		Keys result = Keys.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKeysToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntityFromString(EDataType eDataType, String initialValue) {
		return (Entity)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpriteEntity createSpriteEntityFromString(EDataType eDataType, String initialValue) {
		return (SpriteEntity)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpriteEntityToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneEntity createSceneEntityFromString(EDataType eDataType, String initialValue) {
		return (SceneEntity)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSceneEntityToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optional<?> createOptionalFromString(EDataType eDataType, String initialValue) {
		return (Optional<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptionalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stream<?> createStreamFromString(EDataType eDataType, String initialValue) {
		return (Stream<?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStreamToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KlangPackage getKlangPackage() {
		return (KlangPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static KlangPackage getPackage() {
		return KlangPackage.eINSTANCE;
	}

} //KlangFactoryImpl
