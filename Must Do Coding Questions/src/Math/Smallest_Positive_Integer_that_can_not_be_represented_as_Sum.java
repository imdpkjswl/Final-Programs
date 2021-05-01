package Math;

import java.util.Arrays;

public class Smallest_Positive_Integer_that_can_not_be_represented_as_Sum {
    // Returns the smallest number that cannot be represented as sum
    // of subset of elements from set represented by sorted array arr[0..n-1]
    static int findSmallest(int arr[], int n) {
        Arrays.sort(arr); // sort for random unsorted inputs

        int res = 1; // Initialize result

        // Traverse the array and increment 'res' if arr[i] is
        // smaller than or equal to 'res'.
        for (int i = 0; i < n && arr[i] <= res; i++)
            res = res + arr[i];

        return res;
    }


    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5};
        int n = arr.length;
        System.out.println(findSmallest(arr, n));

    }
}
