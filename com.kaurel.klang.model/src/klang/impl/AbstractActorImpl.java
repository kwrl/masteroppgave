/**
 */
package klang.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import klang.AbstractActor;
import klang.EventHandler;
import klang.KlangPackage;
import klang.VariableDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link klang.impl.AbstractActorImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link klang.impl.AbstractActorImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link klang.impl.AbstractActorImpl#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link klang.impl.AbstractActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link klang.impl.AbstractActorImpl#getSubject <em>Subject</em>}</li>
 *   <li>{@link klang.impl.AbstractActorImpl#getLocalVariables <em>Local Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractActorImpl extends MinimalEObjectImpl.Container implements AbstractActor {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected static final Object SUBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected Object subject = SUBJECT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> localVariables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.ABSTRACT_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override 
	public EList<AbstractActor> getChildren() {
		// TODO: implement this method to return the 'Children' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractActor getParent() {
		// TODO: implement this method to return the 'Parent' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventHandler> getEventHandlers() {
		if (eventHandlers == null) {
			eventHandlers = new EObjectContainmentWithInverseEList<EventHandler>(EventHandler.class, this, KlangPackage.ABSTRACT_ACTOR__EVENT_HANDLERS, KlangPackage.EVENT_HANDLER__ACTOR);
		}
		return eventHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlangPackage.ABSTRACT_ACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(Object newSubject) {
		Object oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlangPackage.ABSTRACT_ACTOR__SUBJECT, oldSubject, subject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getLocalVariables() {
		if (localVariables == null) {
			localVariables = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, KlangPackage.ABSTRACT_ACTOR__LOCAL_VARIABLES);
		}
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInScope(String variableName) {
		return isInLocalScope(variableName) || isInParentScope(variableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VariableDeclaration getVariableDeclaration(String variableName) {
		List<VariableDeclaration> variables = getLocalVariables().stream()
				.filter(v -> v.getName().equals(variableName))
				.collect(Collectors.toList());
		
		if(!variables.isEmpty()) {
			return variables.get(0);
		}

		if(getParent()!=null) {
			return getParent().getVariableDeclaration(variableName);
		}
		
		return null;	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInLocalScope(String variableName) {
		return getLocalVariables().stream().anyMatch(v -> v.getName().equals(variableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInParentScope(String variableName) {
		return getParent() != null && getParent().isInScope(variableName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KlangPackage.ABSTRACT_ACTOR__EVENT_HANDLERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEventHandlers()).basicAdd(otherEnd, msgs);
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
			case KlangPackage.ABSTRACT_ACTOR__EVENT_HANDLERS:
				return ((InternalEList<?>)getEventHandlers()).basicRemove(otherEnd, msgs);
			case KlangPackage.ABSTRACT_ACTOR__LOCAL_VARIABLES:
				return ((InternalEList<?>)getLocalVariables()).basicRemove(otherEnd, msgs);
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
			case KlangPackage.ABSTRACT_ACTOR__CHILDREN:
				return getChildren();
			case KlangPackage.ABSTRACT_ACTOR__PARENT:
				return getParent();
			case KlangPackage.ABSTRACT_ACTOR__EVENT_HANDLERS:
				return getEventHandlers();
			case KlangPackage.ABSTRACT_ACTOR__NAME:
				return getName();
			case KlangPackage.ABSTRACT_ACTOR__SUBJECT:
				return getSubject();
			case KlangPackage.ABSTRACT_ACTOR__LOCAL_VARIABLES:
				return getLocalVariables();
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
			case KlangPackage.ABSTRACT_ACTOR__EVENT_HANDLERS:
				getEventHandlers().clear();
				getEventHandlers().addAll((Collection<? extends EventHandler>)newValue);
				return;
			case KlangPackage.ABSTRACT_ACTOR__NAME:
				setName((String)newValue);
				return;
			case KlangPackage.ABSTRACT_ACTOR__SUBJECT:
				setSubject(newValue);
				return;
			case KlangPackage.ABSTRACT_ACTOR__LOCAL_VARIABLES:
				getLocalVariables().clear();
				getLocalVariables().addAll((Collection<? extends VariableDeclaration>)newValue);
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
			case KlangPackage.ABSTRACT_ACTOR__EVENT_HANDLERS:
				getEventHandlers().clear();
				return;
			case KlangPackage.ABSTRACT_ACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KlangPackage.ABSTRACT_ACTOR__SUBJECT:
				setSubject(SUBJECT_EDEFAULT);
				return;
			case KlangPackage.ABSTRACT_ACTOR__LOCAL_VARIABLES:
				getLocalVariables().clear();
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
			case KlangPackage.ABSTRACT_ACTOR__CHILDREN:
				return !getChildren().isEmpty();
			case KlangPackage.ABSTRACT_ACTOR__PARENT:
				return getParent() != null;
			case KlangPackage.ABSTRACT_ACTOR__EVENT_HANDLERS:
				return eventHandlers != null && !eventHandlers.isEmpty();
			case KlangPackage.ABSTRACT_ACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KlangPackage.ABSTRACT_ACTOR__SUBJECT:
				return SUBJECT_EDEFAULT == null ? subject != null : !SUBJECT_EDEFAULT.equals(subject);
			case KlangPackage.ABSTRACT_ACTOR__LOCAL_VARIABLES:
				return localVariables != null && !localVariables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KlangPackage.ABSTRACT_ACTOR___IS_IN_SCOPE__STRING:
				return isInScope((String)arguments.get(0));
			case KlangPackage.ABSTRACT_ACTOR___GET_VARIABLE_DECLARATION__STRING:
				return getVariableDeclaration((String)arguments.get(0));
			case KlangPackage.ABSTRACT_ACTOR___IS_IN_LOCAL_SCOPE__STRING:
				return isInLocalScope((String)arguments.get(0));
			case KlangPackage.ABSTRACT_ACTOR___IS_IN_PARENT_SCOPE__STRING:
				return isInParentScope((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", subject: ");
		result.append(subject);
		result.append(')');
		return result.toString();
	}

} //AbstractActorImpl
