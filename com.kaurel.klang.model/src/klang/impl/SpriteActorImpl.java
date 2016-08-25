/**
 */
package klang.impl;

import java.lang.reflect.InvocationTargetException;
import klang.KlangPackage;
import klang.SpriteActor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sprite Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpriteActorImpl extends AbstractActorImpl<SpriteActor> implements SpriteActor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpriteActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.SPRITE_ACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void print(String message) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getX() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getY() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(Double y) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(Double x) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void print(Double message) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sleep(Double sleepDuration) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case KlangPackage.SPRITE_ACTOR___PRINT__STRING:
				print((String)arguments.get(0));
				return null;
			case KlangPackage.SPRITE_ACTOR___GET_X:
				return getX();
			case KlangPackage.SPRITE_ACTOR___GET_Y:
				return getY();
			case KlangPackage.SPRITE_ACTOR___SET_Y__DOUBLE:
				setY((Double)arguments.get(0));
				return null;
			case KlangPackage.SPRITE_ACTOR___SET_X__DOUBLE:
				setX((Double)arguments.get(0));
				return null;
			case KlangPackage.SPRITE_ACTOR___PRINT__DOUBLE:
				print((Double)arguments.get(0));
				return null;
			case KlangPackage.SPRITE_ACTOR___SLEEP__DOUBLE:
				sleep((Double)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SpriteActorImpl
