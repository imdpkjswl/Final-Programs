// Time Compexity: O(N), Space Complexity: O(N)
import java.util.*;

public class Sort_Array_Of_0s_1s_2s_Without_Using_DATCH_NATIONAL_FLAG_ALGO {

	static int[] arr = new int[] {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1}; // Given Array

	static void swap(int[] arr, int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {

		int low, mid, high; // Apply Datch National Flag Algorithm: TC:O(n),AS:O(1)
		low = 0;
		mid = 0;
		high = arr.length - 1;


		while (mid <= high) {
			switch (arr[mid]) {

			// If the element is 0.
			case 0:
				swap(arr, low++, mid++);
				break;

			// If the element is 1.
			case 1:
				mid++;
				break;

			// If the element is 2.
			case 2:
				swap(arr, mid, high--);
				break;
			}
		}

		for (int i : arr)
			System.out.print(i + "  ");

	}
}