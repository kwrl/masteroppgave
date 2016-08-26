/**
 */
package klang.impl;

import java.util.Collection;

import klang.KlangPackage;
import klang.Program;
import klang.SceneActor;
import klang.SpriteActor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link klang.impl.ProgramImpl#getSceneActor <em>Scene Actor</em>}</li>
 *   <li>{@link klang.impl.ProgramImpl#getSpriteActors <em>Sprite Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getSceneActor() <em>Scene Actor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSceneActor()
	 * @generated
	 * @ordered
	 */
	protected SceneActor sceneActor;

	/**
	 * The cached value of the '{@link #getSpriteActors() <em>Sprite Actors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpriteActors()
	 * @generated
	 * @ordered
	 */
	protected EList<SpriteActor> spriteActors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneActor getSceneActor() {
		return sceneActor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSceneActor(SceneActor newSceneActor, NotificationChain msgs) {
		SceneActor oldSceneActor = sceneActor;
		sceneActor = newSceneActor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KlangPackage.PROGRAM__SCENE_ACTOR, oldSceneActor, newSceneActor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSceneActor(SceneActor newSceneActor) {
		if (newSceneActor != sceneActor) {
			NotificationChain msgs = null;
			if (sceneActor != null)
				msgs = ((InternalEObject)sceneActor).eInverseRemove(this, KlangPackage.SCENE_ACTOR__PROGRAM, SceneActor.class, msgs);
			if (newSceneActor != null)
				msgs = ((InternalEObject)newSceneActor).eInverseAdd(this, KlangPackage.SCENE_ACTOR__PROGRAM, SceneActor.class, msgs);
			msgs = basicSetSceneActor(newSceneActor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlangPackage.PROGRAM__SCENE_ACTOR, newSceneActor, newSceneActor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpriteActor> getSpriteActors() {
		if (spriteActors == null) {
			spriteActors = new EObjectContainmentEList<SpriteActor>(SpriteActor.class, this, KlangPackage.PROGRAM__SPRITE_ACTORS);
		}
		return spriteActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KlangPackage.PROGRAM__SCENE_ACTOR:
				if (sceneActor != null)
					msgs = ((InternalEObject)sceneActor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KlangPackage.PROGRAM__SCENE_ACTOR, null, msgs);
				return basicSetSceneActor((SceneActor)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KlangPackage.PROGRAM__SCENE_ACTOR:
				return basicSetSceneActor(null, msgs);
			case KlangPackage.PROGRAM__SPRITE_ACTORS:
				return ((InternalEList<?>)getSpriteActors()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KlangPackage.PROGRAM__SCENE_ACTOR:
				return getSceneActor();
			case KlangPackage.PROGRAM__SPRITE_ACTORS:
				return getSpriteActors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KlangPackage.PROGRAM__SCENE_ACTOR:
				setSceneActor((SceneActor)newValue);
				return;
			case KlangPackage.PROGRAM__SPRITE_ACTORS:
				getSpriteActors().clear();
				getSpriteActors().addAll((Collection<? extends SpriteActor>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KlangPackage.PROGRAM__SCENE_ACTOR:
				setSceneActor((SceneActor)null);
				return;
			case KlangPackage.PROGRAM__SPRITE_ACTORS:
				getSpriteActors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KlangPackage.PROGRAM__SCENE_ACTOR:
				return sceneActor != null;
			case KlangPackage.PROGRAM__SPRITE_ACTORS:
				return spriteActors != null && !spriteActors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl
