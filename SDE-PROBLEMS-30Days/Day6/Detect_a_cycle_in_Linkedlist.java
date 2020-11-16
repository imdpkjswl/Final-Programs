/*
Naive Approach: Put each node in a Set and check whether any node already exixt in
Set, if it does We can say that Linked list has a cycle.
*/

class ListNode{
	int val;
	ListNode next;

	ListNode(){}
	ListNode(int val){this.val = val;}
	ListNode(int val, ListNode next){this.val=val; this.next=next;} 
}

class Detect_a_cycle_in_Linkedlist {
	private static boolean hasCycle(ListNode head){
		if(head==null || head.next==null)
			return false;

		ListNode slow = head;
		ListNode fast = head;

		while(fast.next!=null && fast.next.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast==slow)
				return true;
		}
		return false;
	}

	public static void main(String[] args){
		// Create head
		ListNode head = null;
	
		// Create a list
		head = new ListNode(1);
        head.next = new ListNode(2); 
        head.next.next = new ListNode(3); 
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head.next.next.next.next = head.next; //Loop/Cycle// 5th node is pointing to 2nd node.

        boolean res = hasCycle(head);
        System.out.println(res);
	}
}