/**
 */
package klang.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

import klang.TreeNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tree Traversal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TreeTraversal {
	public static final TreeTraversal INSTANCE = new TreeTraversal();
	
	public <T extends TreeNode<T>> Stream<T> BreadthFirst(T root) {
		return new BFS<T>(root).getRoute();
	}
	
	class BFS<T extends TreeNode<T>> {
		private List<T> route = new ArrayList<>();
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
		
		public Stream<T> getRoute() {
			return route.stream();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public <T extends TreeNode<T>> Stream<T> DepthFirst(T root) {
		return new DFS<T>(root).getRoute();
	}
	
	public <T extends TreeNode<T>> Stream<T> PathToRoot(T start) {
		List<T> path = new ArrayList<T>();
		T current = start;
		
		while(current!=null) {
			path.add(current);
			current = current.getParent();
		}
		
		return path.stream();
	}

	class DFS <T extends TreeNode<T>>{
		private List<T> route = new ArrayList<>();
		public DFS(T root) {
			traverse(root);
		}
		
		private void traverse(T root) {
			for(T child : root.getChildren()) {
				traverse(child);
			}
			route.add(root);
		}
		
		public Stream<T> getRoute() {
			return route.stream();
		}
	}

} //TreeTraversal
