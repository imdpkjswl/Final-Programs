package Array;

import java.util.ArrayList;

/*
Runtime Error:
Runtime ErrorTime Limit Exceeded

Your program took more time than expected.Time Limit Exceeded
Expected Time Limit 12.03sec
Hint : Please optimize your code and submit again.
 */
/*
public class plus_one {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9); arr.add(9); arr.add(9); // output: 1 0 0 0

        if(arr.get(arr.size()-1)< 9){
            arr.set(arr.size()-1, arr.get(arr.size()-1)+1);
        }else{
            int i;

            for(i=arr.size()-1;i>=0;i--){
                if(arr.get(i) == 9){
                    // Make zero except first element
                    if(i != 0)
                        arr.set(i,0);
                    // Handling least significant element
                    if(arr.get(i)==9 && i==0){
                        int n = arr.size();

                        arr.clear();
                        arr.add(1);
                        for(int j=0;j<n;j++){
                            arr.add(0);
                        }
                        break;
                    }
                }else if(arr.get(i)<9){
                    arr.set(i, arr.get(i)+1);
                    break;
                }
            }
        }

        for(int val:arr){
            System.out.print(val+"  ");
        }
    }
}
 */


/**
Approach : To add one to number represented by digits, follow the below steps :

    *Parse the given array from end like we do in school addition.
    *If the last elements 9, make it 0 and carry = 1.
    *For the next iteration check carry and if it adds to 10, do same as step 2.
    *After adding carry, make carry = 0 for the next iteration.
    *If the vectors add and increase the vector size, append 1 in the beginning.
 */
public class plus_one {
    static ArrayList<Integer> increment(ArrayList<Integer> a , int n) {
        // Add 1 to last digit and find carry
        a.set(n - 1, a.get(n - 1) + 1);

        int carry = a.get(n - 1) / 10;
        a.set(n - 1, a.get(n - 1) % 10);

        // Traverse from second last digit
        for (int i = n - 2; i >= 0; i--) {
            if (carry == 1) {
                a.set(i, a.get(i) + 1);
                carry = a.get(i) / 10;
                a.set(i, a.get(i) % 10);
            }
        }

        // If carry is 1, we need to add 1 at the beginning of vector
        if (carry == 1)
            a.add(0, 1);
        return a;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9); arr.add(9); arr.add(9); // output: 1 0 0 0

        ArrayList<Integer> ans = increment(arr, arr.size());

        for(int val:ans){
            System.out.print(val+"  ");
        }
    }
}
