import java.util.*;

public class Count_Inversions_In_Array {

	// Solving Brute Force of Complexity: O(N^2)
	static int naiveCountInversion(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j] && i < j) {
					count++;
				}
			}
		}
		return count;
	}



	// Solving using Merge Sort Approch Function to count the number of inversions during the merge process
	private static int merge(int[] arr, int l, int m, int r) {

		// Left subarray
		int[] left = Arrays.copyOfRange(arr, l, m + 1); // here m+1 is exclusive

		// Right subarray
		int[] right = Arrays.copyOfRange(arr, m + 1, r + 1); // here r+1 is exclusive

		int i = 0, j = 0, k = l, swaps = 0;

		while (i < left.length && j < right.length) {
			if (left[i] <= right[j])
				arr[k++] = left[i++];
			else {
				arr[k++] = right[j++];
				swaps += (m + 1) - (l + i);
			}
		}

		// Fill from the rest of the left subarray
		while (i < left.length)
			arr[k++] = left[i++];

		// Fill from the rest of the right subarray
		while (j < right.length)
			arr[k++] = right[j++];

		return swaps;
	}

	// Merge sort function
	private static int mergeSort(int[] arr, int left, int right) {

		// Keeps track of the inversion count at a
		// particular node of the recursion tree
		int count = 0;

		if (left < right) {
			int mid = (left + right) / 2;

			// Total inversion count = left subarray count
			// + right subarray count + merge count

			// Left subarray count
			count += mergeSort(arr, left, mid);

			// Right subarray count
			count += mergeSort(arr, mid + 1, right);

			// Merge count
			count += merge(arr, left, mid, right);
		}

		return count;
	}



	public static void main(String[] args) {
		int[] arr = new int[] {8, 4, 2, 1};
		// Brute Force Approach
		int result = naiveCountInversion(arr);
		System.out.println(result);


		int ans = mergeSort(arr, 0, arr.length - 1);
		System.out.println("Number of inversions are:  " + ans);

	}
}