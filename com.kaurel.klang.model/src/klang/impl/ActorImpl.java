/**
 */
package klang.impl;

import java.util.Collection;

import klang.Actor;
import klang.Entity;
import klang.EventHandler;
import klang.KlangPackage;
import klang.Variable;
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
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link klang.impl.ActorImpl#getVariableDeclarations <em>Variable Declarations</em>}</li>
 *   <li>{@link klang.impl.ActorImpl#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link klang.impl.ActorImpl#getEntity <em>Entity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends MinimalEObjectImpl.Container implements Actor {
	/**
	 * The cached value of the '{@link #getVariableDeclarations() <em>Variable Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variableDeclarations;

	/**
	 * The cached value of the '{@link #getEventHandlers() <em>Event Handlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventHandlers()
	 * @generated
	 * @ordered
	 */
	protected EList<EventHandler> eventHandlers;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity entity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariableDeclarations() {
		if (variableDeclarations == null) {
			variableDeclarations = new EObjectContainmentEList<Variable>(Variable.class, this, KlangPackage.ACTOR__VARIABLE_DECLARATIONS);
		}
		return variableDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventHandler> getEventHandlers() {
		if (eventHandlers == null) {
			eventHandlers = new EObjectContainmentEList<EventHandler>(EventHandler.class, this, KlangPackage.ACTOR__EVENT_HANDLERS);
		}
		return eventHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Entity newEntity, NotificationChain msgs) {
		Entity oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KlangPackage.ACTOR__ENTITY, oldEntity, newEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Entity newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KlangPackage.ACTOR__ENTITY, null, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KlangPackage.ACTOR__ENTITY, null, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlangPackage.ACTOR__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KlangPackage.ACTOR__VARIABLE_DECLARATIONS:
				return ((InternalEList<?>)getVariableDeclarations()).basicRemove(otherEnd, msgs);
			case KlangPackage.ACTOR__EVENT_HANDLERS:
				return ((InternalEList<?>)getEventHandlers()).basicRemove(otherEnd, msgs);
			case KlangPackage.ACTOR__ENTITY:
				return basicSetEntity(null, msgs);
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
			case KlangPackage.ACTOR__VARIABLE_DECLARATIONS:
				return getVariableDeclarations();
			case KlangPackage.ACTOR__EVENT_HANDLERS:
				return getEventHandlers();
			case KlangPackage.ACTOR__ENTITY:
				return getEntity();
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
			case KlangPackage.ACTOR__VARIABLE_DECLARATIONS:
				getVariableDeclarations().clear();
				getVariableDeclarations().addAll((Collection<? extends Variable>)newValue);
				return;
			case KlangPackage.ACTOR__EVENT_HANDLERS:
				getEventHandlers().clear();
				getEventHandlers().addAll((Collection<? extends EventHandler>)newValue);
				return;
			case KlangPackage.ACTOR__ENTITY:
				setEntity((Entity)newValue);
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
			case KlangPackage.ACTOR__VARIABLE_DECLARATIONS:
				getVariableDeclarations().clear();
				return;
			case KlangPackage.ACTOR__EVENT_HANDLERS:
				getEventHandlers().clear();
				return;
			case KlangPackage.ACTOR__ENTITY:
				setEntity((Entity)null);
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
			case KlangPackage.ACTOR__VARIABLE_DECLARATIONS:
				return variableDeclarations != null && !variableDeclarations.isEmpty();
			case KlangPackage.ACTOR__EVENT_HANDLERS:
				return eventHandlers != null && !eventHandlers.isEmpty();
			case KlangPackage.ACTOR__ENTITY:
				return entity != null;
		}
		return super.eIsSet(featureID);
	}

} //ActorImpl
