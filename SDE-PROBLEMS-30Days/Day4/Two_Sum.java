import java.util.*;

public class Two_Sum {
	/*
		// Brute Force: O(N^2)
		public static void twoSum(int[] nums, int target) {

			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] + nums[j] == target) {
						System.out.println("(" + i + ", " + j + ")");
					}
				}
			}
			// Or Another approach, subtract target with nums[i] and search reamin target value in the array.

		}
	*/


	// Solving Using Hash Table: O(N)
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				result[1] = i;
				result[0] = map.get(target - nums[i]);
				return result;
			}

			map.put(nums[i], i); // put value with index number in HashMap.
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {2, 7, 11, 15};
		int target = 9;

		// twoSum(nums, target);

		int[] index = twoSum(nums, target);
		for (int i : index)
			System.out.print(i + " ");
	}
}