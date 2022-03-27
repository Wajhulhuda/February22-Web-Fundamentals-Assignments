package binary_tree_I_assignment;
public class FindingHeightOfTree{
	


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
        System.out.println(getHeight(root));
	}

}
