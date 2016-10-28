/**
 */
package klang.impl;

import java.lang.reflect.InvocationTargetException;
import klang.Event;
import klang.KlangPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EventImpl extends MinimalEObjectImpl.Container implements Event {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends Event> boolean matchingEvent(T other) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KlangPackage.EVENT___MATCHING_EVENT__EVENT:
				return matchingEvent((Event)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EventImpl
