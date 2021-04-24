package Math;

import java.util.Arrays;
/*
public class Missing_number_in_array {
    public static void main(String[] args) {
        int N = 3;
        int[] arr = {1,2};
        boolean flag = false;

        Arrays.sort(arr);
        for(int i=0;i<N-1;i++){
            if(arr[i] != (i+1)){
                System.out.println(i+1);
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println(N);
        }
    }
}
 */
/*
Runtime Error:
Runtime ErrorTime Limit Exceeded

Your program took more time than expected.Time Limit Exceeded
Expected Time Limit 1.78sec
Hint : Please optimize your code and submit again.
 */

public class Missing_number_in_array {
    public static void main(String[] args) {
        int N = 7;
        int[] arr = {2,3,4,1,6,7};
        Arrays.sort(arr);

        // Using Binary Search Approach
        int l = 0, r = N-2;
        int m;

        while(l<=r){
            m = (l +((r-l)/2));

            if(arr[m] != (m+1)){
                System.out.println(m+1);
                break;
            }

            if(arr[m] < (m+1)){
                l = m+1;
            }else{
                r = m-1;
            }
        }
    }
}