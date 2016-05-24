/**
 */
package klang.framework.impl;

import klang.KlangPackage;

import klang.framework.Entity;
import klang.framework.FrameworkFactory;
import klang.framework.FrameworkPackage;
import klang.framework.OperatorSet;
import klang.framework.SceneEntity;
import klang.framework.SpriteEntity;

import klang.impl.KlangPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrameworkPackageImpl extends EPackageImpl implements FrameworkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spriteEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sceneEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorSetEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see klang.framework.FrameworkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FrameworkPackageImpl() {
		super(eNS_URI, FrameworkFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FrameworkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FrameworkPackage init() {
		if (isInited) return (FrameworkPackage)EPackage.Registry.INSTANCE.getEPackage(FrameworkPackage.eNS_URI);

		// Obtain or create and register package
		FrameworkPackageImpl theFrameworkPackage = (FrameworkPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FrameworkPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FrameworkPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		KlangPackageImpl theKlangPackage = (KlangPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(KlangPackage.eNS_URI) instanceof KlangPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(KlangPackage.eNS_URI) : KlangPackage.eINSTANCE);

		// Create package meta-data objects
		theFrameworkPackage.createPackageContents();
		theKlangPackage.createPackageContents();

		// Initialize created meta-data
		theFrameworkPackage.initializePackageContents();
		theKlangPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFrameworkPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FrameworkPackage.eNS_URI, theFrameworkPackage);
		return theFrameworkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntity() {
		return entityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpriteEntity() {
		return spriteEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSceneEntity() {
		return sceneEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperatorSet() {
		return operatorSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkFactory getFrameworkFactory() {
		return (FrameworkFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		entityEClass = createEClass(ENTITY);

		spriteEntityEClass = createEClass(SPRITE_ENTITY);

		sceneEntityEClass = createEClass(SCENE_ENTITY);

		operatorSetEClass = createEClass(OPERATOR_SET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		spriteEntityEClass.getESuperTypes().add(this.getEntity());
		sceneEntityEClass.getESuperTypes().add(this.getEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spriteEntityEClass, SpriteEntity.class, "SpriteEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sceneEntityEClass, SceneEntity.class, "SceneEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operatorSetEClass, OperatorSet.class, "OperatorSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //FrameworkPackageImpl
