/**
 */
package klang;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link klang.TreeNode#getChildren <em>Children</em>}</li>
 *   <li>{@link klang.TreeNode#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see klang.KlangPackage#getTreeNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TreeNode<T extends TreeNode<T>> extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' reference list.
	 * @see klang.KlangPackage#getTreeNode_Children()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<T> getChildren();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see klang.KlangPackage#getTreeNode_Parent()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	T getParent();
	
} // TreeNode
