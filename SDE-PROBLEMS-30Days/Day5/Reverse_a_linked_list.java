import java.util.*;

class ListNode {
	int val;
	ListNode next;
	ListNode() {};
	ListNode(int val) {this.val = val;}
	ListNode(int val, ListNode next){this.val = val;  this.next = next;}
}

class Reverse_a_linked_list {
	// Time complexity: O(N) & Auxiliary Space: O(1)
	private static ListNode reverseList(ListNode head) {
		ListNode newHead = null; // dummy node

		while(head != null) {
			ListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}

		return newHead;

	}
	

	public static void main(String[] args) {
		// Create head
		ListNode head = null;

		// Create a list
		head = new ListNode(1);
        head.next = new ListNode(2); 
        head.next.next = new ListNode(3); 
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("List before reversed:");
        printList(head);

        // Reverse a list
        head = reverseList(head);
        System.out.println("\nList after reversed:");
        printList(head);
	}

	private static void printList(ListNode node) { 
        while (node != null) { 
            System.out.print(node.val + " "); 
            node = node.next; 
        } 
    } 
}