package binary_tree_II_assignment;

public class PathSum {
	
	static boolean pathSum(Node root, int Tsum) {
		if (root == null)
			return false;
		if (root.key == Tsum && root.left == null && root.right == null)
			return true;

		return pathSum(root.left, Tsum - root.key) || pathSum(root.right, Tsum - root.key);
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
        
        System.out.println( pathSum(root,9));
	}

}
