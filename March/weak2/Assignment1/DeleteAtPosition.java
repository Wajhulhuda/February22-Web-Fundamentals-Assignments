package linkedlist_I_assignment;

public class DeleteAtPosition {
	Node head;
	static class Node {
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
	
	public void deleteAtPosition(int position) {
		if(head == null)
			return;
		Node temp = head;
		if(position ==0 ) {
			head = temp.next;
			return;
		}
		for(int i=0; temp!=null && i<position-1;i++)
			temp = temp.next;
			if(temp == null || temp.next == null)
				return;
			Node next = temp.next.next;
			temp.next = next;
		
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
		DeleteAtPosition obj = new DeleteAtPosition();
		obj.insert(3);
		obj.insert(44);
		obj.insert(45);
		obj.insert(34);
		obj.insert(22);
		obj.print();
		obj.deleteAtPosition(0);
		obj.print();
		obj.deleteAtPosition(3);
		obj.print();
	}

}
