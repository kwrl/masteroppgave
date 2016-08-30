/**
 */
package klang.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import klang.AbstractActor;
import klang.AbstractElement;
import klang.KlangPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Abstract Element</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractElementImpl extends MinimalEObjectImpl.Container implements AbstractElement {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.ABSTRACT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public AbstractActor getActor() {
		EObject current = this;
		while (current != null) {
			current = current.eContainer();
			if (current instanceof AbstractActor) {
				return (AbstractActor) current;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KlangPackage.ABSTRACT_ELEMENT___GET_ACTOR:
				return getActor();
		}
		return super.eInvoke(operationID, arguments);
	}

} // AbstractElementImpl
