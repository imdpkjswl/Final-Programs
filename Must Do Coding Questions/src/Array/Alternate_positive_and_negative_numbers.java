package Array;

import java.util.*;

/**
 * Time complexity: O(N)
 * Auxiliary Space: O(N)
*/
public class Alternate_positive_and_negative_numbers {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        // Separating +ve and -ve elements
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                positive.add(arr[i]);
            }else{
                negative.add(arr[i]);
            }
        }

        int n1 = positive.size();
        int n2 = negative.size();
        boolean flag = n1 > n2; // identifying which is bigger

        int i=0,j=0,k=0;
        // Performing the basic operation
        while(i<n1 && j<n2){
                arr[k++] = positive.get(i++);
                arr[k++] = negative.get(j++);
        }

        // Special cases handling
        if(flag){
            //Now, -ve is empty. so simply put remaining element into resultant array
            for(;i<n1;i++){
                arr[k++] = positive.get(i);
            }
        }else{
            //Now, +ve is empty. so simply put remaining element into resultant array
            for(;j<n2;j++){
                arr[k++] = negative.get(j);
            }
        }

        for(int val:arr){
            System.out.print(val+"  ");
        }

    }
}
