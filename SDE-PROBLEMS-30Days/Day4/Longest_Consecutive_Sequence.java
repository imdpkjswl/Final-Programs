import java.util.*;

// naive appraoch is to sort array and fing longest streak.


class Longest_Consecutive_Sequence {
	
	// Time complexity: O(3N) & Auxiliary space: O(N)
	private static int solution(int[] arr){
		int longestSequence = 0;
		
		HashSet<Integer> set = new HashSet<>();

		// Put array elements into set
		for(int i : arr) {
			set.add(i);
		}

		// Iterate over the array
		for(int num : arr) {
			if(!set.contains(num - 1)){  // Base condition(algorithm) applied
				int currentNum = num;
				int currentStreak = 1;   // 1 due to already one occurred 

				while(set.contains(currentNum+1)){  // Count sequence increasing by one
					currentStreak++;
					currentNum++;
				}

				longestSequence = Math.max(longestSequence, currentStreak);  // store the max

			}
		}

		return longestSequence;
	}

	public static void main(String[] args) {

		int[] arr = new int[]{102, 4, 100, 1, 101, 3, 2};

		int result = solution(arr);

		System.out.println(result);
	}
}