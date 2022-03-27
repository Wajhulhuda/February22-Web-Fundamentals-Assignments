package binary_tree_I_assignment;

public class SumOfNodes {
	
	static int sumOfNode(Node root)
	{
	    if (root == null)
	        return 0;
	    return (root.key + sumOfNode(root.left) +
	    		sumOfNode(root.right));
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
        
       System.out.println( sumOfNode(root));
	}

}
