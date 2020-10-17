import java.util.*;
// naive appraoch is to apply Kadane's algorithm and fing longest subarray having sum zero.


class Longest_Subarray_With_Zero_Sum {
	
	// Optimal solution
	// Time complexity: O(NLogN) & Auxiliary space: O(N)
	private static int solution(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int maxi = 0;
		int sum = 0;

		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			if(sum == 0){
				maxi = i+1;
			}
			else{
				if(map.get(sum) != null){  // check if sum exist in hashset or not.
					maxi = Math.max(maxi, i-map.get(sum)); // take diff of indeces
				}else{
					map.put(sum, i); // (sumValue, Index)
				}
			}
		}

		return maxi;
	}

	public static void main(String[] args) {

		int[] arr = new int[]{1, -1, 3, 2, -2,-8, 1, 7, 10, 23};

		int result = solution(arr);

		System.out.println(result);
	}
}