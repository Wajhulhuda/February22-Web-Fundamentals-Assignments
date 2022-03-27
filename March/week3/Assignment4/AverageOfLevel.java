import java.util.LinkedList;
import java.util.Queue;

public class AverageOfLevel {
	static void AvgOfLevel(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			int k = q.size();
			int sum = 0;
			int N = k;
			while (k > 0) {
				Node front = q.poll();
				sum += front.key;
				// Adding valid left child
				if (front.left != null) {
					q.add(front.left);
				}
				// Adding valid right child
				if (front.right != null) {
					q.add(front.right);
				}
				k--;
			}
			System.out.print((float) sum / N);
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
        
        AvgOfLevel(root);

	}

}
