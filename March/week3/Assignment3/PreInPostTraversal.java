package binary_tree_I_assignment;


class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}
public class PreInPostTraversal {
	
	public static void preorder(Node root) {
		// Base case => to check for null roots
		if (root == null)
			return;

		System.out.print(root.key + ",");
		preorder(root.left);
		preorder(root.right);
	}

	public static void inorder(Node root) {
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.key + ",");
		inorder(root.right);

	}

	public static void postOrder(Node root) {
		if (root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.key + ",");

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
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postOrder(root);
	}

}
