/**
 */
package klang.impl;

import klang.Event;
import klang.GameStartEvent;
import klang.KlangPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Start Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class GameStartEventImpl extends GlobalEventImpl implements GameStartEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameStartEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.GAME_START_EVENT;
	}

	@Override
	public <T extends Event> boolean matchingEvent(T other) {
		if(other instanceof GameStartEvent) {
			return true;
		}
		return false;
	}

} //GameStartEventImpl
