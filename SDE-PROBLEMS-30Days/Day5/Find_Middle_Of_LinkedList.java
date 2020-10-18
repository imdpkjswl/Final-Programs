import java.util.*;

// The naive approach is to first calculate total no. of nodes, then find (total/2)+1.
// and finally traverse till (total/2)+1 and return value of node.It took Time: O(N)(findSize) + O(N/2)(Traversal)


// Definition of linkedlist
class ListNode {
	int val;
	ListNode next;
	ListNode() {};
	ListNode(int val) {this.val = val;}
	ListNode(int val, ListNode next){this.val = val;  this.next = next;}
}


// Here, we are using two Turles method(slow-1x & fast-2x)
class Find_Middle_Of_LinkedList {
	// Time complexity: O(N/2) & Auxiliary Space: O(1)
	private static int findMiddle(ListNode head) {
		ListNode slow = head, fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;			
		}
		return slow.val; // mid value
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

        // Find middle a list
        int mid = findMiddle(head);
        System.out.println(mid);
	}
}