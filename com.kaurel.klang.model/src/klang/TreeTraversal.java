/**
 */
package klang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tree Traversal</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see klang.KlangPackage#getTreeTraversal()
 * @model
 * @generated
 */
public interface TreeTraversal extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends TreeNode<T>> EList<T> BreadthFirst(T root);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends TreeNode<T>> EList<T> DepthFirst(T root);

} // TreeTraversal
