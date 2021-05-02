package Array;

import java.util.ArrayList;
import java.util.Stack;

public class Leaders_in_an_array {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        int tmp = arr[arr.length-1];
        st.push(tmp);
        for(int i=arr.length-2;i>=0;i--){
            if(tmp <= arr[i]){
                st.push(arr[i]);
                tmp = arr[i];
            }
        }

        while(!st.empty()){
            ans.add(st.pop());
        }

        for(int val:ans){
            System.out.print(val+"  ");
        }
    }
}
