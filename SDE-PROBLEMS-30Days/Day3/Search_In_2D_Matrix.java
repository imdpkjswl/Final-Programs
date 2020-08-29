import java.util.*;

// The problem has two variant one of from GFG & Other one from
// LeetCode:See both example to get know more about this.
public class Search_In_2D_Matrix {

	// Solved in O(n)
	private static boolean searchGFG(int[][] matrix, int x) {
		int i = 0;
		int j = matrix.length - 1;
		int n = matrix[0].length - 1;

		// Start searching from last index of first row.
		while (i < n && j >= 0) { // handled out of bound, when we move left OR down
			if (matrix[i][j] == x) {
				System.out.println(x + " found at: " + i + "th row & " + j + "th column");
				return true;
			}

			if (matrix[i][j] > x)
				j--; // move left
			else
				i++; // move down
		}

		return false;
	}


	// Solved in O(Log2(n*m))
	private static boolean searchLeetCode(int[][] matrix, int target) {
		if (matrix.length == 0 ) return false;

		int m = matrix.length;
		int n = matrix[0].length;

		int low = 0;
		int high = (m * n) - 1;

		// Applying Binary Search Technique
		while (low <= high) {
			int mid = (low + (high - low) / 2);
			if (matrix[mid / n][mid % n] == target) {
				System.out.println(target + " found at: " + mid / n + "th row & " + mid % n + "th column");
				return true;
			}

			if (matrix[mid / n][mid % n] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return false;

	}


	public static void main(String[] args) {
		int[][] matrixGFG = new int[][]	{
			{10, 20, 30, 40},
			{11, 21, 36, 43},
			{25, 29, 39, 50},
			{50, 60, 70, 80}
		};
		int target1 = 25;
		boolean result1 = searchGFG(matrixGFG, target1);
		if (!result1)
			System.out.println("Target not found.");


// ----------------------------------------------------------------
		int[][] matrixLeetCode = new int[][]	{
			{1, 3, 5, 7},
			{10, 11, 16, 20},
			{23, 29, 34, 50},
			{52, 61, 76, 80}
		};
		int target2 = 61;
		boolean result2 = searchLeetCode(matrixLeetCode, target2);
		if (!result2)
			System.out.println("Target not found.");


	}
}