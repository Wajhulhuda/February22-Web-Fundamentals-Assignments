package binary_tree_I_assignment;

public class PrintLeafNodes {
	
	static void print_leafNodes(Node root) {
		if (root == null)
			return;

		if (root.left == null && root.right == null) {
			System.out.println("LeafNode:" + root.key);
		}
		print_leafNodes(root.left);
		print_leafNodes(root.right);
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
        
        print_leafNodes(root);
	}

}
