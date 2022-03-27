package binary_tree_II_assignment;

import java.util.LinkedList;
import java.util.Queue;

public class RightNodes {
	
	static void LeftViewOfTree(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			int k = q.size();
			for (int i = 0; i < k; i++) {
				Node front = q.poll();
				if (i == 0) {
					System.out.print(front.key + ",");
				}
				
				if (front.right != null) {
					q.add(front.right);
				}

				if (front.left != null) {
					q.add(front.left);
				}
			
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(6);
        root.right.left.right = new Node(7);
        root.right.right.right = new Node(8);
        root.right.left.right.left = new Node(9);
        LeftViewOfTree(root);
	}

}
