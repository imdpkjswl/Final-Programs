import java.util.Scanner;
import java.util.Stack;

public class InternTextEditor {
    static String ans = "";
    static Stack<String> st = new Stack<>();

    static void append(String s){
        ans = ans+s;
        st.push(ans);
    }

    static void delete(){
        ans = ans.substring(0,ans.length()-1);
        st.pop();
        st.push(ans);
    }

    static char print(){
        return ans.charAt(ans.length()-1);
    }

    static void undo(){
        st.pop();
        ans = st.peek();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int t = -1;
        for(int i=0;i<n;i++){
            int op = sc.nextInt();
            String tmp = sc.next();
            if(tmp.length() == 1){
                t = Integer.parseInt(tmp);
            }

            if(op == 1){
                append(tmp);
            }else if(op == 2){
                delete();
            }else if(op ==3){
                System.out.println(print());
            }else if(op==4){
                undo();
            }else{
                System.out.println(ans);
            }

        }

    }
}
