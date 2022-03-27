public class CountOfNode {
	
	static int get_count(Node root) {
		if (root == null) {
			return 0;
		}
		int leftCount = get_count(root.left);
		int rightCount = get_count(root.right);
		return 1 + leftCount + rightCount;
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
        
        System.out.println(get_count(root));
	}

}
