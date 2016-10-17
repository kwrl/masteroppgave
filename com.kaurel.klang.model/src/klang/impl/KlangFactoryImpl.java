/**
 */
package klang.impl;

import klang.*;
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
			case KlangPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			case KlangPackage.GAME_START: return createGameStart();
			case KlangPackage.SPRITE_CLICKED: return createSpriteClicked();
			case KlangPackage.KEY_PRESSED: return createKeyPressed();
			case KlangPackage.COLLIDES_WITH: return createCollidesWith();
			case KlangPackage.PROGRAM: return createProgram();
			case KlangPackage.TREE_TRAVERSAL: return createTreeTraversal();
			case KlangPackage.MESSAGE_RECEIVED: return createMessageReceived();
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
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GameStart createGameStart() {
		GameStartImpl gameStart = new GameStartImpl();
		return gameStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpriteClicked createSpriteClicked() {
		SpriteClickedImpl spriteClicked = new SpriteClickedImpl();
		return spriteClicked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyPressed createKeyPressed() {
		KeyPressedImpl keyPressed = new KeyPressedImpl();
		return keyPressed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollidesWith createCollidesWith() {
		CollidesWithImpl collidesWith = new CollidesWithImpl();
		return collidesWith;
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
	public TreeTraversal createTreeTraversal() {
		TreeTraversalImpl treeTraversal = new TreeTraversalImpl();
		return treeTraversal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageReceived createMessageReceived() {
		MessageReceivedImpl messageReceived = new MessageReceivedImpl();
		return messageReceived;
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
