// Time complexity: O(N) & Space complexity: O(1)

import java.util.*;

// Note: Here, Majority element must be appeared n/2 times in the given array.

public class Majority_Element_N_By_2_Times {
	// By solving Brute force & Hashmap technique might be expensive
	// So, we will use "Moose Voting Algorithm".
	public static void main(String[] args) {
		int[] arr = new int[] {4, 1, 4, 4, 4, 3, 4, 2, 4, 5, 4, 1};

		int count = 0;
		int candidate = 0;

		for (int num : arr) {
			if (count == 0 )
				candidate = num;

			if (num == candidate)
				count += 1;
			else
				count -= 1;
		}

		if (count <= 1)
			System.out.println("No majority element found");
		else
			System.out.println("Majority element found: " + candidate);



	}
}