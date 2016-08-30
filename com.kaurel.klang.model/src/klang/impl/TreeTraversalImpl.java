/**
 */
package klang.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.Queue;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import klang.KlangPackage;
import klang.TreeNode;
import klang.TreeTraversal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Traversal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TreeTraversalImpl extends MinimalEObjectImpl.Container implements TreeTraversal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TreeTraversalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KlangPackage.Literals.TREE_TRAVERSAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public <T extends TreeNode<T>> EList<T> BreadthFirst(T root) {
		return new BFS<T>(root).getRoute();
	}
	
	class BFS<T extends TreeNode<T>> {
		private EList<T> route = new BasicEList<>();
		public BFS(T root) {
			traverse(root);
		}
		
		private void traverse(T root) {
			Queue<T> queue = new LinkedList<>();
			queue.add(root);
			T current;
			
			while((current=queue.poll())!=null) {
				route.add(current);
				queue.addAll(current.getChildren());
			}
		}
		
		public EList<T> getRoute() {
			return route;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public <T extends TreeNode<T>> EList<T> DepthFirst(T root) {
		return new DFS<T>(root).getRoute();
	}
	
	class DFS <T extends TreeNode<T>>{
		private EList<T> route = new BasicEList<>();
		public DFS(T root) {
			traverse(root);
		}
		
		private void traverse(T root) {
			for(T child : root.getChildren()) {
				traverse(child);
			}
			route.add(root);
		}
		
		public EList<T> getRoute() {
			return route;
		}
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
			case KlangPackage.TREE_TRAVERSAL___BREADTH_FIRST__TREENODE:
				return BreadthFirst((TreeNode)arguments.get(0));
			case KlangPackage.TREE_TRAVERSAL___DEPTH_FIRST__TREENODE:
				return DepthFirst((TreeNode)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TreeTraversalImpl
