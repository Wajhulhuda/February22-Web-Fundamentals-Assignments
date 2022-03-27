package linkedlist_II_assignment;

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}

class MergeLinkedList {
	Node sortedMerge(Node A, Node B) {
		if (A == null)
			return B;
		if (B == null)
			return A;
		if (A.data < B.data) {
			A.next = sortedMerge(A.next, B);
			return A;
		} else {
			B.next = sortedMerge(A, B.next);
			return B;
		}

	}

}

public class MergeTwoSortedLL {

	Node head;

	public void addLast(Node node) {
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
	}

	void printLinkList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeTwoSortedLL llist1 = new MergeTwoSortedLL();
		MergeTwoSortedLL llist2 = new MergeTwoSortedLL();

		llist1.addLast(new Node(5));
		llist1.addLast(new Node(10));
		llist1.addLast(new Node(15));
		System.out.println("List A");
		llist1.printLinkList();

		llist2.addLast(new Node(2));
		llist2.addLast(new Node(3));
		llist2.addLast(new Node(20));
		System.out.println("List B");
		llist2.printLinkList();
		
		llist1.head = new MergeLinkedList().sortedMerge(llist1.head, llist2.head);
		System.out.println("A and B merged List");
		llist1.printLinkList();
	}

}
