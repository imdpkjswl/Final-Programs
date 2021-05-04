package Array;

import java.util.Arrays;

public class Product_array_puzzle {
    public static void main(String[] args) {
        int[] nums = {0, 8, 6, 2, 4, 7, 9, 3, 9, 2, 8, 3, 0, 1, 7, 8, 9, 1, 5, 4, 9, 2, 5, 7, 4, 9, 9, 4};
        long[] ans = new long[nums.length];

        int zeros =0;

        long product=1;
        // Finding product of all element except zeros and count zero also.
        for(int i=0;i< nums.length;i++){
            if(nums[i] !=0) {
                product *= nums[i];
            }
            else {
                zeros++;
            }
        }

        //System.out.println(zeros);
        // Special cases, when zero will be more than one
        if(zeros >=2){
            Arrays.fill(ans,0);
        }
        // When zero will be less than  or equal to one
        else {
            for (int i = 0; i < nums.length; i++) {
                if (zeros == 0) { // For no zero element
                    ans[i] = (product / nums[i]);
                } else { // For one zero element
                    if (nums[i] != 0) { // current element is non-zero, put zero
                        ans[i] = 0;
                    } else { // current element is zero, put product of remaining
                        ans[i] = product;
                    }
                }
            }
        }


        for(long val:ans){
            System.out.print(val+"  ");
        }


    }
}
