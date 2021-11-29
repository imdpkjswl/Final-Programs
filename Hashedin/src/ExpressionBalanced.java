import java.util.Scanner;
import java.util.Stack;

public class ExpressionBalanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "([{}{}])";

        Stack<Character> st = new Stack<Character>();

        for(int i=0;i<str.length();i++) {
            char chr = str.charAt(i);
            // Push closed parenthesis, when open parenthesis occur
            if(chr == '{')
                st.push('}');
            else if(chr == '[')
                st.push(']');
            else if( chr == '(')
                st.push(')');
            else{
                if(!st.isEmpty() && st.pop() != str.charAt(i)){
                    System.out.println("NOT BALANCED");
                    System.exit(1);
                }
            }
        }

        if(st.isEmpty())
            System.out.println("BALANCED");
        else
            System.out.println("NOT BALANCED");


    }
}

