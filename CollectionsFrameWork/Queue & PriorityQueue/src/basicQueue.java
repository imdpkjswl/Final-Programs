import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class basicQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();

        // Add item into queue
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);

        // Get the peek item of queue,returns null if this queue is empty.
        System.out.println(que.peek());

        // Remove the item from queue
        que.poll(); //  similar as que.remove();

        //Retrieve the head of this queue but NOT remove
        System.out.println(que.element());


        // Iterate over the queue
        Iterator<Integer> itr = que.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
