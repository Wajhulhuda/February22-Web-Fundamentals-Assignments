package linkedlist_II_assignment;

import linkedlist_I_assignment.InsertAtPosition;

public class RemoveDuplicatesLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next = null;
		}
	}
	
	void removeDuplicate() {
		Node current = head;
		while(current != null) {
			Node temp = current;
			while(temp!= null && temp.data==current.data) {
				temp = temp.next;
			}
			current.next = temp;
			current = current.next;
		}
	}
	
	public void insert(int data) {
		Node new_node = new Node(data);
		new_node.next = null;

		if (head == null) {
			head = new_node;
			return;
		} else {
			Node tempNode =head;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = new_node;
		}

	}

	void printList() {
		Node temp = head;
		while(temp!= null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesLinkedList llist = new RemoveDuplicatesLinkedList();
		llist.insert(2);
		llist.insert(3);
		llist.insert(4);
		llist.insert(4);
		llist.insert(4);
		llist.insert(5);
		llist.insert(5);
		llist.insert(5);
		llist.insert(6);
		llist.insert(6);
		
		System.out.println("List before removal of duplicates");
		llist.printList();
		System.out.println();
		llist.removeDuplicate();
		System.out.println("List after removal of duplicates");
		llist.printList();
		
	}

}
