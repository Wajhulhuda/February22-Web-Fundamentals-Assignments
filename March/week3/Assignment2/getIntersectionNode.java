class intersectionList {
	public Node getIntersectionNode(Node A, Node B) {
		  while (A != null) {
		    Node pB = B;
		    while (pB != null) {
		      if (A == pB) return A;
		      pB = pB.next;
		    }
		    A = A.next;
		  }
		  return null;
		}


}
public class IntersectionOfLinkedList {
	
	
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
		
		Node result = llist1.head = new intersectionList().getIntersectionNode(llist1.head, llist2.head);
		System.out.println("Intersection of two linklist");
		System.out.println(result);
	}

}
