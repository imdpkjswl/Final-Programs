/***
*Naive Methods:
1.Brute Force: For each iteration, select node of first list and iterate to second list,
 if node[i] == node[j], we can say that node is the intersection point.

2.Hashing: Create a set and put all node of first list and then for second iteration, check
whether second list node is already present in first list,then at that time we can say that 
the node is the intersection point.

*Optimal Approaches:
1.Dummy Node: First find length of both list and then subtract bigger length minus smaller one(say K),then
Traverse bigger list K steps and and atlast Traverse in both list simultaneously by creating two dummy node,
whenever both dummy node get equal to each other(dummy1 == dumm2),we can say that node is intersection point. 


2.Dummy SHift: We create two dummy node and traverse simultaneously to both list and if anyone reaches to end
we have set last node to first node of another list for both cases and the traverse until dummy1 == dummy2.      
*/

class Find_Intersection_Point_Of_Y_Linkedlist{
	private static ListNode getIntersectionNode(ListNode headA, ListNode headB){
		if(headA==null || headB==null) return null;

		ListNode a = headA;
		ListNode b = headB;

		//if a & b have different length, then we will stop the loop after second iteration.
		while(a != b){
			// For the end of first iteration, we just reset the pointer to the head of another linkedlist.
			a = a==null?headB:a.next;
			b = b==null?headA:b.next;
		}

		return a;	
	}

	public static void main(String[] args){
		// Given two heads.
	}
}
