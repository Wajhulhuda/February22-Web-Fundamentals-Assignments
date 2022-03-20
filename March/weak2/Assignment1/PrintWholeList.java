package linkedlist_I_assignment;

import java.util.LinkedList;

import linkedlist_I_assignment.SearchElementInLinkedList.Node;

public class PrintWholeList {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void insert(int data) {
		Node New_Node = new Node(data);
		New_Node.next = null;
		if (this.head == null) {
			this.head = New_Node;
		} else {
			Node tempNode = this.head;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = New_Node;
		}

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

		PrintWholeList linkList = new PrintWholeList();

		linkList.insert(44);
		linkList.insert(54);
		linkList.insert(47);
		linkList.insert(54);
		linkList.insert(91);
		linkList.insert(27);
		linkList.insert(10);
		linkList.insert(86);

		linkList.print();

	}

}
