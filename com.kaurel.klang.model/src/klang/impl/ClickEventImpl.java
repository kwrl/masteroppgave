/**
 */
package klang.impl;

import klang.ClickEvent;
import klang.Event;
import klang.KlangPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Click Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClickEventImpl extends ActorEventImpl implements ClickEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClickEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.CLICK_EVENT;
	}

	@Override
	public <T extends Event> boolean matchingEvent(T other) {
		if(other instanceof ClickEventImpl) {
			return true;
		}
		return false;
	}

} //ClickEventImpl
