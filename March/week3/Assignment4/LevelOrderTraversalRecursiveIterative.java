package binary_tree_II_assignment;

import java.util.LinkedList;
import java.util.Queue;




public class LevelOrderTraversalRecursiveIterative {
	
	static void levelTraversal(Node root) {
		int h = getHeight(root);

		for (int i = 0; i <= h; i++) {
			PrintKthLevel(root, i);
			System.out.println();
		}
	}
	static void LevelOrderTraversal(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			int k = q.size();
			while (k > 0) {
				Node front = q.poll();
				// Adding valid left child
				if (front.left != null) {
					q.add(front.left);
				}
				// Adding valid right child
				if (front.right != null) {
					q.add(front.right);
				}
				k--;
				System.out.print(front.key + ",");
			}
			System.out.println();
		}
	}
	
	static int getHeight(Node node) {
		if (node.left == null && node.right == null)
			return 0;
		else {
			/* compute the depth of each subtree */
			int lheight = getHeight(node.left);
			int rheight = getHeight(node.right);

			/* use the larger one */
			if (lheight >= rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}
	
	static void PrintKthLevel(Node root, int k) {
		if (root == null)
			return;

		if (k == 0) {
			System.out.print(root.key + " ");
		}
		PrintKthLevel(root.left, k - 1);
		PrintKthLevel(root.right, k - 1);
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
        levelTraversal(root);
        LevelOrderTraversal(root);
	}

}
