// Time Compexity: O(N), Space Complexity: O(N)

import java.util.*;

public class Maximum_Subarray_Sum_Kadane_s_Algorithm {

	// Solved in O(N^2)
	private static int bruteForce(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				if (sum > max ) {
					max = sum;
				}
			}
		}
		return max;
	}

	// Solved in O(N)
	private static int OptimalSolution(int[] input) {

		int sum, bestSum;

		bestSum = sum = input[0];

		for (int i = 1; i < input.length; i++) {
			sum = Math.max(input[i], input[i] + sum);
			bestSum = Math.max(sum, bestSum);
		}

		return bestSum;
	}

	// Solved in O(N) By Kadane's Algorithm
	private static int KadaneAlgorithm(int[] nums) {
		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int it : nums) {
			sum += it;
			max = Math.max(sum, max);
			if (sum < 0) sum = 0;
		}
		return max;
	}


	public static void main(String[] args) {

		int[] arr = new int[] { -2, -3, 4, -1, -2, 1, 5, -3};

		System.out.println(bruteForce(arr));
		System.out.println(OptimalSolution(arr));

		System.out.println(KadaneAlgorithm(arr));
	}
}