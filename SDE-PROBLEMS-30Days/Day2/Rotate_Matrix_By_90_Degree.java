// Time complexity: O(n^2)+O(n^2) & Space complexity: O(1)

import java.util.*;

public class Rotate_Matrix_By_90_Degree {
	private static int[][] matrix = new int[][] {	{1, 2, 3},
		{4, 5, 6},
		{7, 8, 9}
	};

	private static void rotate() {
		// Firstly, transpose the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix[0].length; j++) {
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		// Secondly, reverse the each row of matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				int temp = 0;
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}


	}

	public static void main(String[] args) {
		rotate();

		// print rotated matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}

}