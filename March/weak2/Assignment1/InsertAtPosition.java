package linkedlist_I_assignment;

public class InsertAtPosition {
	Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void insert(InsertAtPosition list, int data) {
		Node new_node = new Node(data);
		new_node.next = null;

		if (list.head == null) {
			list.head = new_node;
			return;
		} else {
			Node tempNode = list.head;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = new_node;
		}

	}

	public void insertNodeAtPosition(int data, int position) {
		Node new_Node = new Node(data);
		new_Node.next = null;

		if (this.head == null) {
			if (position != 0) {
				return;
			} else {
				this.head = new_Node;
			}
		}

		if (head != null && position == 0) {
			new_Node.next = this.head;
			this.head = new_Node;
			return;
		}

		Node current = this.head;
		Node previous = null;
		int i = 0;
		while (i < position) {
			previous = current;
			current = current.next;
			if (current == null) {
				break;
			}
			i++;
		}
		new_Node.next = current;
		previous.next = new_Node;
	}

	public void print() {
		if (this.head == null) {
			return;
		}
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InsertAtPosition obj = new InsertAtPosition();
		obj.insert(obj, 23);
		obj.insertNodeAtPosition(13, 0);
		obj.insert(obj, 21);
		obj.insert(obj, 89);
		obj.insertNodeAtPosition(54, 2);
		obj.insertNodeAtPosition(33, 5);
		obj.print();

	}

}
