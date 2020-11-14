/*
Here, the idea is to first find the mid of linkedlist, then reverse the right half of linkedlist
and compare left half and reversed right half for palindromic list.
*/

 // Created Node
class ListNode{
	int val;
	ListNode next;

	ListNode(){

	}

	ListNode(int val){
		this.val = val;
	}
	ListNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
}


class Check_For_Palindromic_Linkedlist{
	private static ListNode reverseList(ListNode head){
		ListNode pre = null;
		ListNode cur = null;
		while(head != null){
			cur = head.next;
			head.next = pre;
			pre = head;
			head = cur;
		}

		return pre;
	}

	private static boolean isPalindrome(ListNode head){
		if(head == null || head.next == null)
			return true;

		ListNode slow = head;
		ListNode fast = head;

		// find middle of linked list
		while(fast.next != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}

		// reverse the right half
		slow.next = reverseList(slow.next);

		// move slow to right half
		slow = slow.next;

		// check for left half right half equal or not
		while(slow != null){
			if(head.val != slow.val)
				return false;
			head = head.next;
			slow = slow.next;
		}

		return true; 
	}

	public static void main(String[] args){
		// Create head
		ListNode head = null;
	
		// Create a list
		head = new ListNode(1);
        head.next = new ListNode(2); 
        head.next.next = new ListNode(3); 
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        boolean res = isPalindrome(head);
        System.out.println(res);
	}
}