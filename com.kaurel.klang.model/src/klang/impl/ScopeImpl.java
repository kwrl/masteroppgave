/**
 */
package klang.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import klang.KlangPackage;
import klang.Scope;
import klang.VariableDeclaration;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Scope</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link klang.impl.ScopeImpl#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link klang.impl.ScopeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link klang.impl.ScopeImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScopeImpl<S extends Scope<?>> extends MinimalEObjectImpl.Container implements Scope<S> {
	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<VariableDeclaration> localVariables;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<S> children;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.SCOPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableDeclaration> getLocalVariables() {
		if (localVariables == null) {
			localVariables = new EObjectContainmentEList<VariableDeclaration>(VariableDeclaration.class, this, KlangPackage.SCOPE__LOCAL_VARIABLES);
		}
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<S> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<S>(Scope.class, this, KlangPackage.SCOPE__CHILDREN, KlangPackage.SCOPE__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Scope<?> getParent() {
		if (eContainerFeatureID() != KlangPackage.SCOPE__PARENT) return null;
		return (Scope<?>)eInternalContainer();
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KlangPackage.SCOPE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case KlangPackage.SCOPE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, KlangPackage.SCOPE__PARENT, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KlangPackage.SCOPE__LOCAL_VARIABLES:
				return ((InternalEList<?>)getLocalVariables()).basicRemove(otherEnd, msgs);
			case KlangPackage.SCOPE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case KlangPackage.SCOPE__PARENT:
				return eBasicSetContainer(null, KlangPackage.SCOPE__PARENT, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case KlangPackage.SCOPE__PARENT:
				return eInternalContainer().eInverseRemove(this, KlangPackage.SCOPE__CHILDREN, Scope.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KlangPackage.SCOPE__LOCAL_VARIABLES:
				return getLocalVariables();
			case KlangPackage.SCOPE__CHILDREN:
				return getChildren();
			case KlangPackage.SCOPE__PARENT:
				return getParent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KlangPackage.SCOPE__LOCAL_VARIABLES:
				getLocalVariables().clear();
				getLocalVariables().addAll((Collection<? extends VariableDeclaration>)newValue);
				return;
			case KlangPackage.SCOPE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends S>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KlangPackage.SCOPE__LOCAL_VARIABLES:
				getLocalVariables().clear();
				return;
			case KlangPackage.SCOPE__CHILDREN:
				getChildren().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KlangPackage.SCOPE__LOCAL_VARIABLES:
				return localVariables != null && !localVariables.isEmpty();
			case KlangPackage.SCOPE__CHILDREN:
				return children != null && !children.isEmpty();
			case KlangPackage.SCOPE__PARENT:
				return getParent() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KlangPackage.SCOPE___IS_IN_SCOPE__STRING:
				return isInScope((String)arguments.get(0));
			case KlangPackage.SCOPE___GET_VARIABLE_DECLARATION__STRING:
				return getVariableDeclaration((String)arguments.get(0));
			case KlangPackage.SCOPE___IS_IN_LOCAL_SCOPE__STRING:
				return isInLocalScope((String)arguments.get(0));
			case KlangPackage.SCOPE___IS_IN_PARENT_SCOPE__STRING:
				return isInParentScope((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} // ScopeImpl
