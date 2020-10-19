import java.util.*;

// Definition of linkedlist
class ListNode {
	int val;
	ListNode next;
	ListNode() {};
	ListNode(int val) {this.val = val;}
	ListNode(int val, ListNode next){this.val = val;  this.next = next;}
}


class Delete_a_given_Node_when_a_Node_given {

	//Time complexity: O(1) & Auxiliary Space: O(1)
	private static void deleteNode(ListNode node) {
		if(node.next == null){ // when given is last node.
			node = null; //not working
			return;
		}

		node.val = node.next.val;
		node.next = node.next.next;
	}
	
	// Create head
	private static ListNode head = null;
	public static void main(String[] args) {
		
		// Create a list
		head = new ListNode(1);
        head.next = new ListNode(5); 
        head.next.next = new ListNode(7); 
        head.next.next.next = new ListNode(12);
        head.next.next.next.next = new ListNode(15);

       	// Given only node which going to be deleted.
       	// We can access only suffix nodes.
    	deleteNode(head.next.next); // deleted 7 just in O(1).    
        printList(head);
	}

	private static void printList(ListNode node) { 
        while (node != null) { 
            System.out.print(node.val + " "); 
            node = node.next; 
        } 
    } 
}