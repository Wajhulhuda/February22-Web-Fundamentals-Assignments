package linkedlist_I_assignment;

import linkedlist_I_assignment.PrintWholeList.Node;

public class PrintFromIndex {
	
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
	
	public void printNodesFromIndex(int index) {
		System.out.println("Nodes start from index");
			int i=0;
		if (this.head == null) {
			return;

		}
		Node temp = this.head;
		while (temp != null) {
			if(i >=index)
			System.out.print(temp.data + ",");
			i++;
			temp = temp.next;
		}
		
		System.out.println();
	}
	public void print() {
		System.out.println("Whole Nodes of LinkedList");
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
		PrintFromIndex lList = new PrintFromIndex();

		lList.insert(44);
		lList.insert(54);
		lList.insert(47);
		lList.insert(54);
		lList.insert(91);
		lList.insert(27);
		lList.insert(10);
		lList.insert(86);
		
		lList.print();
		lList.printNodesFromIndex(3);
	}

}
