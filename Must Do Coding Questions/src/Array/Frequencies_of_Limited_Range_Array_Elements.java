package Array;

import java.util.Arrays;
/*
Runtime Error:
Runtime ErrorException in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
	at Solution.frequencyCount(File.java:48)
	at GFG.main(File.java:26)
 */
public class Frequencies_of_Limited_Range_Array_Elements {
    public static void main(String[] args) {
        int N = 5;//7;
        int[] arr = {2, 3, 2, 3, 5};//{2, 3, 3, 1, 2, 3, 5};
        int p = 5; // 1<= arr[i] <= p

        int[] table = new int[N+1];
        Arrays.fill(table, 0);
        for(int i=0;i<N;i++){
            table[arr[i]]++;
        }

        for(int i=1;i< N+1;i++){
            arr[i-1] = table[i];
        }

        for(int val: arr){
            System.out.print(val+" ");
        }
    }
}
