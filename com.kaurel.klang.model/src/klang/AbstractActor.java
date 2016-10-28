/**
 */
package klang;

import java.util.stream.Stream;
import klang.entities.Entity;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.AbstractActor#getEventHandlers <em>Event Handlers</em>}</li>
 *   <li>{@link klang.AbstractActor#getName <em>Name</em>}</li>
 *   <li>{@link klang.AbstractActor#getSubject <em>Subject</em>}</li>
 *   <li>{@link klang.AbstractActor#getLocalVariables <em>Local Variables</em>}</li>
 *   <li>{@link klang.AbstractActor#getSubjectType <em>Subject Type</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getAbstractActor()
 * @model abstract="true" TBounds="klang.Entity"
 * @generated
 */
public interface AbstractActor<T extends Entity> extends TreeNode<AbstractActor<?>> {
	/**
	 * Returns the value of the '<em><b>Event Handlers</b></em>' containment reference list.
	 * The list contents are of type {@link klang.EventHandler}.
	 * It is bidirectional and its opposite is '{@link klang.EventHandler#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Handlers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Handlers</em>' containment reference list.
	 * @see klang.KlangPackage#getAbstractActor_EventHandlers()
	 * @see klang.EventHandler#getActor
	 * @model opposite="actor" containment="true"
	 * @generated
	 */
	EList<EventHandler> getEventHandlers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see klang.KlangPackage#getAbstractActor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link klang.AbstractActor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' attribute.
	 * @see #setSubject(Entity)
	 * @see klang.KlangPackage#getAbstractActor_Subject()
	 * @model transient="true"
	 * @generated
	 */
	T getSubject();

	/**
	 * Sets the value of the '{@link klang.AbstractActor#getSubject <em>Subject</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' attribute.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(T value);

	/**
	 * Returns the value of the '<em><b>Local Variables</b></em>' containment reference list.
	 * The list contents are of type {@link klang.VariableDeclaration}.
	 * It is bidirectional and its opposite is '{@link klang.VariableDeclaration#getActor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Variables</em>' containment reference list.
	 * @see klang.KlangPackage#getAbstractActor_LocalVariables()
	 * @see klang.VariableDeclaration#getActor
	 * @model opposite="actor" containment="true"
	 * @generated
	 */
	EList<VariableDeclaration> getLocalVariables();

	/**
	 * Returns the value of the '<em><b>Subject Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject Type</em>' attribute.
	 * @see klang.KlangPackage#getAbstractActor_SubjectType()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	Class<T> getSubjectType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableNameRequired="true"
	 * @generated
	 */
	boolean isInScope(String variableName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableNameRequired="true"
	 * @generated
	 */
	VariableDeclaration getVariableDeclaration(String variableName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableNameRequired="true"
	 * @generated
	 */
	boolean isInLocalScope(String variableName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model variableNameRequired="true"
	 * @generated
	 */
	boolean isInParentScope(String variableName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="klang.Stream<klang.VariableDeclaration>" variableNameRequired="true"
	 * @generated
	 */
	Stream<VariableDeclaration> getVariableDeclarations(String variableName);

} // AbstractActor
