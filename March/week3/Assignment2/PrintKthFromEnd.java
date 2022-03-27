package linkedlist_II_assignment;


public class PrintKthFromEnd {

	static Node head;

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
	public Node nthFromLastNode(Node head,int n)
    {
        Node firstPtr=head;
        Node secondPtr=head;
 
        for (int i = 0; i < n; i++) {
            firstPtr=firstPtr.next;
 
        }
 
        while(firstPtr!=null)
        {
            firstPtr=firstPtr.next;
            secondPtr=secondPtr.next;
        }
 
        return secondPtr;
    }
 
    public static void main(String[] args) {
    	PrintKthFromEnd list = new PrintKthFromEnd();
        // Creating a linked list
  
        
        list.insert(45);
        list.insert(84);
        list.insert(6);
        list.insert(9);
        list.insert(12);
        list.insert(70);
        int index=4;
        // Finding 3rd node from end
        Node nthNodeFromLast= list.nthFromLastNode(head,index);
        System.out.println(index+"th node from end is : "+ nthNodeFromLast.data);
    }
}
