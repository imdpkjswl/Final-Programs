import java.util.*;

// Definition of linkedlist
class ListNode {
	int val;
	ListNode next;
	ListNode() {};
	ListNode(int val) {this.val = val;}
	ListNode(int val, ListNode next){this.val = val;  this.next = next;}
}


class Merge_Two_Sorted_Linkedlist {

	//Naive Solution: Time complexity: O(N1+N2) & Auxiliary Space: O(N)
	private static ListNode mergeLinkedList(ListNode head1, ListNode head2) {
		// a dummy first node to hang the result on.
    	ListNode dummyNode = new ListNode(0);
     
    	// tail points to the last result node 
    	ListNode cur = dummyNode;
    	
    	while(true) {
         	// if either list runs out, use the other list(Best-Jugad)
	        if(head1 == null){
	            cur.next = head2;
	            break;
	        }
	        if(head2 == null){
	            cur.next = head1;
	            break;
	        }
	         

	        if(head1.val <= head2.val){
	            cur.next = head1;
	            head1 = head1.next;
	        } 
	        else{
	            cur.next = head2;
	            head2 = head2.next;
	        }
	         
	        cur = cur.next;
	    }

    	return dummyNode.next; // return excepting dummy node.
	}





	//In-Place Solution: Time complexity: O(N1+N2) & Auxiliary Space: O(1)
	private static ListNode mergeLinkedListINPLACE(ListNode l1, ListNode l2) {
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val > l2.val){
			ListNode t = l1;
			l1 = l2;
			l2 = t;
		}

		ListNode res = l1;
		while(l1 != null && l2 != null){
			
			ListNode tmp = null;
			while(l1 != null && l1.val <= l2.val){
				tmp = l1;
				l1 = l1.next;
			}
			tmp.next = l2;

			// swap
			ListNode temp = l1;
			l1 = l2;
			l2 = temp; 
		}

		return res;
    	
	}
	

	public static void main(String[] args) {
		// Create head
		ListNode head1 = null;
		ListNode head2 = null;

		// Create a list
		head1 = new ListNode(1);
        head1.next = new ListNode(5); 
        head1.next.next = new ListNode(7); 
        head1.next.next.next = new ListNode(12);
        head1.next.next.next.next = new ListNode(15);

        // Create another list
		head2 = new ListNode(3);
        head2.next = new ListNode(6); 
        head2.next.next = new ListNode(10); 
        
        // Merge lists using extra space
        //ListNode result1 = mergeLinkedList(head1, head2);
      	//printList(result1);

      	// Merge lists without using extra space 
      	ListNode result2 = mergeLinkedListINPLACE(head1, head2);
      	printList(result2);

	}

	private static void printList(ListNode node) { 
        while (node != null) { 
            System.out.print(node.val + " "); 
            node = node.next; 
        } 
    } 
}