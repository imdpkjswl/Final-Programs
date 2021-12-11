import java.util.Random;
import java.util.Scanner;

// Node Creation
class Node{
    int data;
    Node next;

    protected Node(int data){
        this.data = data;
        next = null;
    }

}


public class simpleLinkedList {
    //static Scanner sc = new Scanner(System.in);

    static Node insertRear(Node head){
        Random r = new Random();
        Node tmp = new Node(r.nextInt(20));

        // First time inserting node
        if(head == null){
            head = tmp;
            return head;
        } else {
            Node cur = head;

            while(cur.next!=null){
                cur = cur.next;
            }
            cur.next = tmp;

            return head;
        }
    }

    static Node deleteFront(Node head){
        if(head == null){
            System.out.println("Empty list!!!"); return null;
        }else{
            head = head.next;
            return head;
        }
    }

    static void display(Node head){
        if(head == null){
            System.out.println("Empty list!!!");
        }else{
            while(head != null){
                System.out.print(head.data+"  ");
                head = head.next;
            }
        }
        System.out.println();
    }


    static Node reverse(Node head){
        Node r = null, q = null;
        Node p = head;

        while(p!=null){
            // start sliding
            r = q;
            q = p;
            p = p.next;
            // end sliding

            q.next = r; // change node link
        }

        return q;
    }


    public static void main(String[] args) {
        Node head = null;

        head = insertRear(head);
        head = insertRear(head);
        head = insertRear(head);
        head = insertRear(head);
        head = insertRear(head);
        display(head);

        head = deleteFront(head);
        display(head);

        head = reverse(head);
        display(head);

    }
}

/**
 * Code output:
 * Enter the value:
 * 5
 * Enter the value:
 * 7
 * Enter the value:
 * 9
 *
 * display after insert
 * 5  7  9
 *
 * display after delete
 * 7  9
 */
