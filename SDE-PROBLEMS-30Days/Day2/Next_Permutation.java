import java.util.*;

public class Next_Permutation {

	private static void NextPermutation(int[] A) {
		if (A == null || A.length <= 1) return;
		int i = A.length - 2;
		while (i >= 0 && A[i] >= A[i + 1]) i--;
		if (i >= 0) {
			int j = A.length - 1;
			while (A[j] <= A[i]) j--;
			swap(A, i, j);
		}
		reverse(A, i + 1, A.length - 1);
	}

	private static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}

	private static void reverse(int[] A, int i, int j) {
		while (i < j) swap(A, i++, j--);
	}


	private static int[] permute = new int[] {1, 3, 2};
	public static void main(String[] args) {
		System.out.println("The Current Permutation:");
		for (int i : permute)
			System.out.print(i + " ");
		System.out.println();

		NextPermutation(permute);
		System.out.println("The Next Permutation:");
		for (int i : permute)
			System.out.print(i + " ");
	}
}