/*Example:
Input:
K = 3
1 2 3 4 5 6 7 8

Output:
3 2 1 6 5 4 7 8
*/

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){this.val = val; this.next = next;}
}

class Reverse_a_Linkedlist_In_a_groups_of_K {
    private static ListNode reverseKGroup(ListNode head, int k){
        if(head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode pre = dummy;
        ListNode cur = dummy;
        ListNode nex = dummy;

        int count = 0;
        while(cur.next != null){
            cur = cur.next;
            count++;
        }

        while(count >= k){
            cur = pre.next;
            nex = cur.next;

            for(int i=1;i<k;i++){
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }

            pre = cur;
            count -= k;
        }

        return dummy.next;
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
        head.next.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(8);

        int k = 3;
        ListNode res = reverseKGroup(head, k);
        ListNode cur = res;
        while(cur!=null){
            System.out.print(cur.val+"  ");
            cur = cur.next;
        }

    }
}