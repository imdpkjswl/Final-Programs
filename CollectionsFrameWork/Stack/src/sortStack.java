import java.util.Stack;

public class sortStack {
    public static Stack<Integer> sort(Stack<Integer> st) {
        Stack<Integer> tmp = new Stack<>();

        while(!st.empty()) {
            
            int curr = st.pop();

            while(!tmp.empty() && tmp.peek() > curr) {
                st.push(tmp.pop());
            }

            tmp.push(curr);
        }
        return tmp;
    }

    public static void main(String[] args) {

        Stack<Integer> input = new Stack<Integer>();

        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        // This is the temporary stack
        Stack<Integer> tmpStack = sort(input);

        System.out.println("Sorted numbers are:");
        for(Integer val:tmpStack){
            System.out.print(val+"  ");
        }
    }
}
