/**
 */
package klang.impl;

import java.util.Collection;
import klang.AbstractActor;
import klang.Event;
import klang.EventHandler;
import klang.KlangPackage;
import klangexpr.Statement;
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
 * An implementation of the model object '<em><b>Event Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link klang.impl.EventHandlerImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link klang.impl.EventHandlerImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link klang.impl.EventHandlerImpl#getReferenceEvent <em>Reference Event</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventHandlerImpl extends MinimalEObjectImpl.Container implements EventHandler {
	/**
	 * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statements;

	/**
	 * The cached value of the '{@link #getReferenceEvent() <em>Reference Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceEvent()
	 * @generated
	 * @ordered
	 */
	protected Event referenceEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.EVENT_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatements() {
		if (statements == null) {
			statements = new EObjectContainmentEList<Statement>(Statement.class, this, KlangPackage.EVENT_HANDLER__STATEMENTS);
		}
		return statements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractActor<?> getActor() {
		if (eContainerFeatureID() != KlangPackage.EVENT_HANDLER__ACTOR) return null;
		return (AbstractActor<?>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getReferenceEvent() {
		return referenceEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceEvent(Event newReferenceEvent, NotificationChain msgs) {
		Event oldReferenceEvent = referenceEvent;
		referenceEvent = newReferenceEvent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KlangPackage.EVENT_HANDLER__REFERENCE_EVENT, oldReferenceEvent, newReferenceEvent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceEvent(Event newReferenceEvent) {
		if (newReferenceEvent != referenceEvent) {
			NotificationChain msgs = null;
			if (referenceEvent != null)
				msgs = ((InternalEObject)referenceEvent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KlangPackage.EVENT_HANDLER__REFERENCE_EVENT, null, msgs);
			if (newReferenceEvent != null)
				msgs = ((InternalEObject)newReferenceEvent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KlangPackage.EVENT_HANDLER__REFERENCE_EVENT, null, msgs);
			msgs = basicSetReferenceEvent(newReferenceEvent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlangPackage.EVENT_HANDLER__REFERENCE_EVENT, newReferenceEvent, newReferenceEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KlangPackage.EVENT_HANDLER__ACTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, KlangPackage.EVENT_HANDLER__ACTOR, msgs);
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
			case KlangPackage.EVENT_HANDLER__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
			case KlangPackage.EVENT_HANDLER__ACTOR:
				return eBasicSetContainer(null, KlangPackage.EVENT_HANDLER__ACTOR, msgs);
			case KlangPackage.EVENT_HANDLER__REFERENCE_EVENT:
				return basicSetReferenceEvent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case KlangPackage.EVENT_HANDLER__ACTOR:
				return eInternalContainer().eInverseRemove(this, KlangPackage.ABSTRACT_ACTOR__EVENT_HANDLERS, AbstractActor.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KlangPackage.EVENT_HANDLER__STATEMENTS:
				return getStatements();
			case KlangPackage.EVENT_HANDLER__ACTOR:
				return getActor();
			case KlangPackage.EVENT_HANDLER__REFERENCE_EVENT:
				return getReferenceEvent();
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
			case KlangPackage.EVENT_HANDLER__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case KlangPackage.EVENT_HANDLER__REFERENCE_EVENT:
				setReferenceEvent((Event)newValue);
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
			case KlangPackage.EVENT_HANDLER__STATEMENTS:
				getStatements().clear();
				return;
			case KlangPackage.EVENT_HANDLER__REFERENCE_EVENT:
				setReferenceEvent((Event)null);
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
			case KlangPackage.EVENT_HANDLER__STATEMENTS:
				return statements != null && !statements.isEmpty();
			case KlangPackage.EVENT_HANDLER__ACTOR:
				return getActor() != null;
			case KlangPackage.EVENT_HANDLER__REFERENCE_EVENT:
				return referenceEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //EventHandlerImpl
