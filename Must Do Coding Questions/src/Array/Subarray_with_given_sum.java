package Array;

/*
    Runtime Error:
Runtime ErrorTime Limit Exceeded

Your program took more time than expected.Time Limit Exceeded
Expected Time Limit 3.59sec
Hint : Please optimize your code and submit again.
     */
/*
public class Subarray_with_given_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int s = 12;
        int i,j;
        out:
        for(i=0;i<arr.length;i++){
            int tmp = 0;
            for(j=i;j<arr.length;j++){
                tmp += arr[j];
                if(tmp == s){
                    System.out.println((i+1)+" - "+(j+1));
                    break out;
                }
            }
        }
     }
}
*/

/**
 * Important Questions---------------------------->
 */
//Using Dynamic Size Sliding Window Technique
public class Subarray_with_given_sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};//{15,2,4,8,9,5,10,23};
        int sum = 12;//36;

        int tmp=0,start=0,end=-1;

        while(tmp<sum && start < arr.length && end < arr.length-1) {
            while (tmp < sum && end < arr.length - 1) {
                tmp += arr[++end];
                //System.out.print(tmp+"\t");

            }
            while (sum < tmp && start < arr.length) {
                tmp -= arr[start++];
                //System.out.print(tmp+"\t");
            }
            if (tmp == sum) {
                //System.out.println(start + " - " + end);
                break;
            }
        }


        //System.out.println("\n"+tmp);
        System.out.print(start+1+" ");
        System.out.print(end+1);
    }
}
