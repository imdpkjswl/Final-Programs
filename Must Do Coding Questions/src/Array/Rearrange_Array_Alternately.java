package Array;

import java.util.Arrays;

public class Rearrange_Array_Alternately {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        // Auxiliary array to hold modified array
        int[] temp = arr.clone();

        // Indexes of smallest and largest elements from remaining array.
        int small = 0, large = arr.length - 1;

        // To indicate whether we need to copy remaining
        // largest or remaining smallest at next position
        boolean flag = true;

        // Store result in temp[]
        for (int i = 0; i < arr.length; i++) {
            if (flag)
                arr[i] = temp[large--];
            else
                arr[i] = temp[small++];

            flag = !flag;
        }

        for(int val:arr) {
            System.out.print(val + " ");
        }
    }
}
