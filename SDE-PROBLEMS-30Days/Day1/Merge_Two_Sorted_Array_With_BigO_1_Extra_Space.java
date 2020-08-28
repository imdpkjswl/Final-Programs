// Time Compexity: O(N), Space Complexity: O(N), Auxiliary Space: O(1)

import java.util.*;


public class Merge_Two_Sorted_Array_With_BigO_1_Extra_Space {

	// Function to find next gap.
	private static int nextGap(int gap) {
		if (gap <= 1)
			return 0;
		return (gap / 2) + (gap % 2);
	}

	private static void merge(int[] arr1, int[] arr2, int n, int m) {

		int i, j, gap = n + m;
		for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
			// comparing elements in the first array.
			for (i = 0; i + gap < n; i++)
				if (arr1[i] > arr1[i + gap]) {
					int temp = arr1[i];
					arr1[i] = arr1[i + gap];
					arr1[i + gap] = temp;
				}

			// comparing elements in both arrays.
			for (j = gap > n ? gap - n : 0 ;
			        i < n && j < m; i++, j++)
				if (arr1[i] > arr2[j]) {
					int temp = arr1[i];
					arr1[i] = arr2[j];
					arr2[j] = temp;
				}

			if (j < m) {
				// comparing elements in the second array.
				for (j = 0; j + gap < m; j++)
					if (arr2[j] > arr2[j + gap]) {
						int temp = arr2[j];
						arr2[j] = arr2[j + gap];
						arr2[j + gap] = temp;
					}
			}
		}
	}

	public static void main(String[] args) {

		int[] arr1 = new int[] {1, 4, 7, 8, 10};
		int[] arr2 = new int[] {2, 3, 9};

		// Solving By GAP METHOD: ceilValue(Gap): (n1+n2)/2
		merge(arr1, arr2, arr1.length, arr2.length);

		System.out.println("merged arrays are:");
		for (int i : arr1)
			System.out.print(i + "  ");
		System.out.println();
		for (int i : arr2)
			System.out.print(i + "  ");

	}
}