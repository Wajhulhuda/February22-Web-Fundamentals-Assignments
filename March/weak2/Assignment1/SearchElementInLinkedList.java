package linkedlist_I_assignment;

import linkedlist_I_assignment.DeleteAtPosition.Node;

public class SearchElementInLinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void insert(int data) {
		Node New_Node = new Node(data);
		New_Node.next=null;
		if(this.head == null) {
			this.head = New_Node;
		}else {
			Node tempNode = this.head;
			while(tempNode.next != null) {
				tempNode = tempNode.next;
			}
			tempNode.next = New_Node;
		}
		
	}
	
	public void searchElement(int data) {
		Node current = head;
		int i=1;
		boolean flag = false;
		if(head == null) {
			System.out.println("List is empty");
		}else {
			while(current!=null) {
				if(current.data == data) {
					flag= true;
					break;
				}
				i++;
				current = current.next;
			}
		}
		if(flag)
			System.out.println("Element "+ data + " present at index: "+i);
		else
			System.out.println("-1");
	}
	public void print() {
		
		if(this.head==null) {
			return;
			
		}
		Node temp = this.head;
		while(temp!= null) {
			System.out.print(temp.data+",");
			temp= temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchElementInLinkedList obj = new SearchElementInLinkedList();
		obj.insert(34);
		obj.insert(2);
		obj.insert(59);
		obj.insert(33);
		obj.insert(85);
		obj.insert(48);
		obj.insert(93);
		
		obj.print();
		
		obj.searchElement(33);
		

	}

}
