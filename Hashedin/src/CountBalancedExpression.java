import java.util.Scanner;
import java.util.Stack;

public class CountBalancedExpression {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int count=0;
        String str = "([{})}]{{}]{}}"; // count=5

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            // Push closed parenthesis, when open parenthesis occur
            if (chr == '{')
                st.push('}');
            else if (chr == '[')
                st.push(']');
            else if (chr == '(')
                st.push(')');
            else {
                if(!st.isEmpty() && st.peek() == str.charAt(i)){
                    st.pop(); count++;
                }
            }
        }

        System.out.println(count);

    }
}
