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
/*
public class Missing_number_in_array {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {2,3,4,1,6,7};

        // Using summation formula n(n+1)/2
        int sum = n*(n+1)/2;
        int actualSum = 0;

        for(int i=0;i<n-1;i++){
            actualSum += arr[i];
        }

        int ans = sum - actualSum;
        System.out.println(ans);
    }
}
 */

public class Missing_number_in_array {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {2,3,4,1,6,7};

        // Using modification of summation formula
        int sum  = 1;
        int c =  2;

        for(int i=0;i<n-1;i++){
            sum = sum - arr[i] + c++;
        }
        System.out.println(sum);
    }
}