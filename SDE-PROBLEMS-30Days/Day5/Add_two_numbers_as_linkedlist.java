import java.util.*;

// Definition of linkedlist
class ListNode {
	int val;
	ListNode next;
	ListNode() {};
	ListNode(int val) {this.val = val;}
	ListNode(int val, ListNode next){this.val = val;  this.next = next;}
}


// In this problem, The carry digits are stored in reverse order.
class Add_two_numbers_as_linkedlist {

	//Time complexity: O(max(N1, N2)) & Auxiliary Space: O(N)
	private static ListNode addNum(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode temp = dummy;

		int carry = 0;

		while(l1 != null || l2 != null || carry == 1){
			int sum = 0;
			if(l1 != null){
				sum += l1.val;
				l1 = l1.next;
			}

			if(l2 != null){
				sum += l2.val;
				l2 = l2.next;
			}

			sum += carry;
			carry = sum/10; // reinitialize carry

			ListNode node = new ListNode(sum % 10);
			temp.next = node;
			temp = temp.next;
		}		

		return dummy.next;
	}
	
	
	public static void main(String[] args) {
	
		// Create head
		ListNode head1 = null;
		ListNode head2 = null;	
		
		// Create a list
		head1 = new ListNode(2);
        head1.next = new ListNode(4); 
        head1.next.next = new ListNode(3);

        		// Create a list
		head2 = new ListNode(5);
        head2.next = new ListNode(6); 
        head2.next.next = new ListNode(7); 
        head2.next.next.next = new ListNode(9);

    	ListNode head = addNum(head1, head2);   
        printList(head);
	}

	private static void printList(ListNode node) { 
        while (node != null) { 
            System.out.print(node.val + " "); 
            node = node.next; 
        } 
    } 
}