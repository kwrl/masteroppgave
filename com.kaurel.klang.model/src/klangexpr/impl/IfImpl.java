/**
 */
package klangexpr.impl;

import java.util.Collection;

import klangexpr.Expression;
import klangexpr.If;
import klangexpr.KlangexprPackage;
import klangexpr.Statement;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link klangexpr.impl.IfImpl#getPredicate <em>Predicate</em>}</li>
 *   <li>{@link klangexpr.impl.IfImpl#getIfBlock <em>If Block</em>}</li>
 *   <li>{@link klangexpr.impl.IfImpl#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfImpl extends StatementImpl implements If {
	/**
	 * The cached value of the '{@link #getPredicate() <em>Predicate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate()
	 * @generated
	 * @ordered
	 */
	protected Expression predicate;

	/**
	 * The cached value of the '{@link #getIfBlock() <em>If Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> ifBlock;

	/**
	 * The cached value of the '{@link #getElseBlock() <em>Else Block</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElseBlock()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> elseBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangexprPackage.Literals.IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPredicate() {
		return predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicate(Expression newPredicate, NotificationChain msgs) {
		Expression oldPredicate = predicate;
		predicate = newPredicate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KlangexprPackage.IF__PREDICATE, oldPredicate, newPredicate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(Expression newPredicate) {
		if (newPredicate != predicate) {
			NotificationChain msgs = null;
			if (predicate != null)
				msgs = ((InternalEObject)predicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KlangexprPackage.IF__PREDICATE, null, msgs);
			if (newPredicate != null)
				msgs = ((InternalEObject)newPredicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KlangexprPackage.IF__PREDICATE, null, msgs);
			msgs = basicSetPredicate(newPredicate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KlangexprPackage.IF__PREDICATE, newPredicate, newPredicate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getIfBlock() {
		if (ifBlock == null) {
			ifBlock = new EObjectContainmentEList<Statement>(Statement.class, this, KlangexprPackage.IF__IF_BLOCK);
		}
		return ifBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getElseBlock() {
		if (elseBlock == null) {
			elseBlock = new EObjectContainmentEList<Statement>(Statement.class, this, KlangexprPackage.IF__ELSE_BLOCK);
		}
		return elseBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KlangexprPackage.IF__PREDICATE:
				return basicSetPredicate(null, msgs);
			case KlangexprPackage.IF__IF_BLOCK:
				return ((InternalEList<?>)getIfBlock()).basicRemove(otherEnd, msgs);
			case KlangexprPackage.IF__ELSE_BLOCK:
				return ((InternalEList<?>)getElseBlock()).basicRemove(otherEnd, msgs);
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
			case KlangexprPackage.IF__PREDICATE:
				return getPredicate();
			case KlangexprPackage.IF__IF_BLOCK:
				return getIfBlock();
			case KlangexprPackage.IF__ELSE_BLOCK:
				return getElseBlock();
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
			case KlangexprPackage.IF__PREDICATE:
				setPredicate((Expression)newValue);
				return;
			case KlangexprPackage.IF__IF_BLOCK:
				getIfBlock().clear();
				getIfBlock().addAll((Collection<? extends Statement>)newValue);
				return;
			case KlangexprPackage.IF__ELSE_BLOCK:
				getElseBlock().clear();
				getElseBlock().addAll((Collection<? extends Statement>)newValue);
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
			case KlangexprPackage.IF__PREDICATE:
				setPredicate((Expression)null);
				return;
			case KlangexprPackage.IF__IF_BLOCK:
				getIfBlock().clear();
				return;
			case KlangexprPackage.IF__ELSE_BLOCK:
				getElseBlock().clear();
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
			case KlangexprPackage.IF__PREDICATE:
				return predicate != null;
			case KlangexprPackage.IF__IF_BLOCK:
				return ifBlock != null && !ifBlock.isEmpty();
			case KlangexprPackage.IF__ELSE_BLOCK:
				return elseBlock != null && !elseBlock.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IfImpl
