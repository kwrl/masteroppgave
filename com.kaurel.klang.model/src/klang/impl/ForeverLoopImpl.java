/**
 */
package klang.impl;

import java.util.Collection;
import klang.ForeverLoop;
import klang.KlangPackage;
import klang.Statement;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Forever Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link klang.impl.ForeverLoopImpl#getLoopStatements <em>Loop Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ForeverLoopImpl extends AbstractElementImpl implements ForeverLoop {
	/**
	 * The cached value of the '{@link #getLoopStatements() <em>Loop Statements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> loopStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ForeverLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.FOREVER_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getLoopStatements() {
		if (loopStatements == null) {
			loopStatements = new EObjectContainmentEList<Statement>(Statement.class, this, KlangPackage.FOREVER_LOOP__LOOP_STATEMENTS);
		}
		return loopStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KlangPackage.FOREVER_LOOP__LOOP_STATEMENTS:
				return ((InternalEList<?>)getLoopStatements()).basicRemove(otherEnd, msgs);
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
			case KlangPackage.FOREVER_LOOP__LOOP_STATEMENTS:
				return getLoopStatements();
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
			case KlangPackage.FOREVER_LOOP__LOOP_STATEMENTS:
				getLoopStatements().clear();
				getLoopStatements().addAll((Collection<? extends Statement>)newValue);
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
			case KlangPackage.FOREVER_LOOP__LOOP_STATEMENTS:
				getLoopStatements().clear();
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
			case KlangPackage.FOREVER_LOOP__LOOP_STATEMENTS:
				return loopStatements != null && !loopStatements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ForeverLoopImpl
