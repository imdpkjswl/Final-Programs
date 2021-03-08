import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class basicDeque {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<>();

        // Add item to front of deque
        deque.addFirst("Bangalore");
        deque.addFirst("Hyderabad");
        deque.addFirst("Chennai");

        // Add item to end of deque
        deque.addLast("Bombay");
        deque.addLast("Delhi");
        deque.addLast("Kerala");


        // Iterate over deque
        Iterator<String> itr = deque.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Remove item from first and last
        deque.pollFirst();
        deque.pollLast();

        // Getting the first and last of queue
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
    }
}
