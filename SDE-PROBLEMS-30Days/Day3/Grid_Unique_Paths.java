import java.util.*;

// Contraint: Only move right and down in Grid.
public class Grid_Unique_Paths {

	// Time & Space Complexity: O(2^N)
	/*	public static int countPaths(int i, int j, int m, int n) {
			if (i >= (m - 1) || j >= (n - 1))
				return 1; // when we reached at end.

			if (i >= m || j >= n)
				return 0; // when we reached out from grid.

			return countPaths(i + 1, j, m, n) + countPaths(i, j + 1, m, n);
			       // This for downward				// This for rightward  & add both transition.
		}
	*/

	// Reducing Time & Space Complexity Using DP: O(N*M)
	public static int countPaths(int i, int j, int m, int n, int[][] dp) {
		if (i >= (m - 1) || j >= (n - 1))
			return 1;

		if (i >= m || j >= n)
			return 0;

		if (dp[i][j] != -1) return dp[i][j];
		return /*Optional: dp[i][j] = */ countPaths(i + 1, j, m, n, dp) + countPaths(i, j + 1, m, n, dp);

	}


	// Reducing Time Complexity Using Combination: O(m-1) or O(n-1) & Space : O(1)
	public static int countPathsComb(int m, int n) {
		// Formula: (m+n-2)C(m-1) OR (m+n-2)C(n-1)
		int N = m + n - 2;
		int R = m - 1;
		double res = 1;

		for (int i = 1; i <= R; i++) {
			res *= (N - R + i) / i;
		}

		return (int)res;
	}



	public static void main(String[] args) {
		// Size of grid
		int m = 2;
		int n = 3;  // end will be (1,2).

		// Initially begin from:
		int i = 0;
		int j = 0;

		// int result = countPaths(i, j, m, n); // Using Recursion

		// Create 2D Grid : AS A HASH TABLE
		int[][] dp = new int[m][n];
		for (int a = 0; a < m; a++)
			for (int b = 0; b < n; b++)
				dp[a][b] = -1;



		// int result = countPaths(i, j, m, n, dp); // Usign DP

		int result = countPathsComb(m, n); // Using Combinations
		System.out.println(result);

	}
}