// Time complexity: O(2(n*m)), Space complexity: O(1)
import java.util.*;

public class Set_Matrix_Zeros {
	public static void main(String[] args) {
		int[][] matrix = new int[][] {{1, 1, 1},
			{1, 0, 1},
			{1, 1, 1}
		};

		// Optimal solution
		int col0 = 1, rows = matrix.length, cols = matrix[0].length;

		for (int i = 0; i < rows; i++) {
			if (matrix[i][0] == 0) cols = 0; // select element in first col
			for (int j = 0; j < cols; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = matrix[0][j] = 0;
				}
			}
		}


		for (int i = rows - 1; i >= 0; i--) {
			for (int j = cols - 1; j >= 1; j--) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
			if (col0 == 0) matrix[i][0] = 0;
		}




		// Print matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}
}