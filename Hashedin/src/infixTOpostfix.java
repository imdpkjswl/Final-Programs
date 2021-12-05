//  https://youtu.be/mg9yi6YuAVk

/**
 * Note: For Infix to Prefix follow given procedure:
 * 1. Reverse the given string.
 * 2. Toggle the brackets of reversed string.
 * 3. Apply infixTOpostfix function and convert in into postfix.
 * 4. At last, reverse the final string after applying infixTOpostfix.
 * 5. You got prefix expression
 */

import java.util.Stack;

public class infixTOpostfix {

    static int prec(char c){
        if(c == '^')
            return 3;
        else if(c == '*' || c == '/')
            return 2;
        else if(c == '+' || c == '-')
            return 1;
        else
            return -1; // for braces
    }

    static String convert(String s){
        Stack<Character> st = new Stack<>();
        String ans = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
                ans += s.charAt(i);

            else if(s.charAt(i) == '(')
                st.push(s.charAt(i));

            else if(s.charAt(i) == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    ans += st.peek();
                    st.pop();
                }

                if(!st.isEmpty())
                    st.pop(); // remove ')'
            }

            else{
                while(!st.isEmpty() && prec(st.peek()) >= prec(s.charAt(i))){
                    ans += st.peek();
                    st.pop();
                }
                st.push(s.charAt(i)); // push current operator
            }
        }

        // Simpy add other operator which is left in stack
        while(!st.isEmpty()){
            ans += st.peek();
            st.pop();
        }

        return ans;
    }


    public static void main(String[] args) {
        String str = "a+b*(c^d-e)^(f+g*h)-i";//"(a-b)*(c+d)";

        System.out.println(convert(str));
    }
}
