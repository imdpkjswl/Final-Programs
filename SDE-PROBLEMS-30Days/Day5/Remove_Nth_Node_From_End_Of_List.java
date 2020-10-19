import java.util.*;

// Definition of linkedlist
class ListNode {
	int val;
	ListNode next;
	ListNode() {};
	ListNode(int val) {this.val = val;}
	ListNode(int val, ListNode next){this.val = val;  this.next = next;}
}


class Remove_Nth_Node_From_End_Of_List {

	//Fast-Slow Pointer Method: Time complexity: O(N) & Auxiliary Space: O(1)
	private static ListNode removeNth(ListNode head, int n) {
		ListNode start = new ListNode();
		start.next = head;

		ListNode fast = start;
		ListNode slow = start;

		for(int i=1;i<=n;++i){
			fast = fast.next;
		}

		while(fast.next != null){
			fast = fast.next;
			slow = slow.next;
		}

		slow.next = slow.next.next;

		return head;
	}
	

	public static void main(String[] args) {
		// Create head
		ListNode head = null;
	
		// Create a list
		head = new ListNode(1);
        head.next = new ListNode(5); 
        head.next.next = new ListNode(7); 
        head.next.next.next = new ListNode(12);
        head.next.next.next.next = new ListNode(15);

        int n =2;
    	head = removeNth(head, n);    
        printList(head);
	}

	private static void printList(ListNode node) { 
        while (node != null) { 
            System.out.print(node.val + " "); 
            node = node.next; 
        } 
    } 
}