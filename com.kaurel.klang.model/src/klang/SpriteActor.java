/**
 */
package klang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sprite Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see klang.KlangPackage#getSpriteActor()
 * @model
 * @generated
 */
public interface SpriteActor extends AbstractActor<SpriteActor> {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model messageRequired="true"
	 * @generated
	 */
	void print(String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Double getX();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Double getY();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model yRequired="true"
	 * @generated
	 */
	void setY(Double y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model xRequired="true"
	 * @generated
	 */
	void setX(Double x);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model messageRequired="true"
	 * @generated
	 */
	void print(Double message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sleep(Double sleepDuration);
} // SpriteActor
