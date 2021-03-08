import java.text.Collator;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class basic {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        // Add item into stack using push()
        st.push(11);
        st.push(13);
        st.push(14);
        st.push(15);
        st.add(12);
        st.add(1,16);

        // Iterate over stack's item
        Iterator<Integer> itr = st.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // Knowing the current capacity of stack
        System.out.println(st.capacity());

        // Knowing the peek val of stack
        System.out.println(st.peek());


        // Remove the last item using pop()
        st.pop();
        // Remove using index
        st.remove(1);

        // Check for emptiness
        System.out.println(st.empty());

        // Return the index of any item, if present. -1 for unavailable
        System.out.println(st.indexOf(12));


        // Search for an item and return position from start position
        int index = st.search(11);
        System.out.println(index);  // 4th pos

        // Foreach loop iteration
        for(Integer val : st){
            System.out.println(val);
        }

        // Get first and last item
        System.out.println(st.firstElement());
        System.out.println(st.lastElement());


    }
}
