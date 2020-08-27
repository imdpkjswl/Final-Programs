// Time Compexity: O(N), Space Complexity: O(N)

import java.util.ArrayList;

// Hare & Tortoise Method for array and linked list:
public class Find_the_duplicate_number_in_an_array {

    // function to find one duplicate
    static int findDuplicate(int[] nums) {

        // return -1 because in these cases there can not be any repeated element
        if (nums.length <= 1)
            return -1;

        // initialize fast and slow
        int slow = nums[0];
        int fast = nums[0];

        // loop to enter in the cycle
        do {
            // move one step for slow
            slow = nums[slow];

            // move two step for fast
            fast = nums[nums[fast]];
        } while (fast != slow);

        // Loop to find entry point of the cycle
        fast = nums[0];
        while (fast != slow) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow; // fast

    }


    public static void main(String[] args) {

        int []arr = {1, 2, 3, 4, 5, 6, 3, 23};

        int dup = findDuplicate(arr);
        System.out.print(dup);

    }
}