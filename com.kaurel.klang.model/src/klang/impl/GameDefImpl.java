/**
 */
package klang.impl;

import java.util.Collection;

import klang.GameDef;
import klang.KlangPackage;
import klang.SpriteDef;
import klang.Variable;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link klang.impl.GameDefImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link klang.impl.GameDefImpl#getActorDefs <em>Actor Defs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameDefImpl extends MinimalEObjectImpl.Container implements GameDef {
	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getActorDefs() <em>Actor Defs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorDefs()
	 * @generated
	 * @ordered
	 */
	protected EList<SpriteDef> actorDefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.GAME_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, KlangPackage.GAME_DEF__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpriteDef> getActorDefs() {
		if (actorDefs == null) {
			actorDefs = new EObjectContainmentEList<SpriteDef>(SpriteDef.class, this, KlangPackage.GAME_DEF__ACTOR_DEFS);
		}
		return actorDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KlangPackage.GAME_DEF__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case KlangPackage.GAME_DEF__ACTOR_DEFS:
				return ((InternalEList<?>)getActorDefs()).basicRemove(otherEnd, msgs);
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
			case KlangPackage.GAME_DEF__VARIABLES:
				return getVariables();
			case KlangPackage.GAME_DEF__ACTOR_DEFS:
				return getActorDefs();
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
			case KlangPackage.GAME_DEF__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case KlangPackage.GAME_DEF__ACTOR_DEFS:
				getActorDefs().clear();
				getActorDefs().addAll((Collection<? extends SpriteDef>)newValue);
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
			case KlangPackage.GAME_DEF__VARIABLES:
				getVariables().clear();
				return;
			case KlangPackage.GAME_DEF__ACTOR_DEFS:
				getActorDefs().clear();
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
			case KlangPackage.GAME_DEF__VARIABLES:
				return variables != null && !variables.isEmpty();
			case KlangPackage.GAME_DEF__ACTOR_DEFS:
				return actorDefs != null && !actorDefs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GameDefImpl
