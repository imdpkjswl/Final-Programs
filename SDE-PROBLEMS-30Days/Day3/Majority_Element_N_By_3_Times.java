// Time complexity: O(N) & Space complexity: O(1)

import java.util.*;

// Note: Here, Majority element must be appeared n/2 times in the given array.

public class Majority_Element_N_By_3_Times {
	// Using Hashing: Time complexity-O(NLogN) & Space complexity-O(N)
	private static void solution1(int[] arr) {
		int n=0;
		for(int i:arr)
			if(i > n)
				n = i;

		int[] freq = new int[n+1];
		Arrays.fill(freq, 0);

		for(int i:arr){
			freq[i]++;
		}

		System.out.println("The Majority Elements(occur more than N/3 times) are:");
		for(int i=0;i<freq.length;i++){
			if(arr.length/3 <= freq[i] && freq[i] != 0){
				System.out.println(i);
			}
		}
	}	


	// Using Boyer Moore Voting Algorithm
	private static ArrayList<Integer> solution2(int[] arr) {
		int num1 = -1, num2 = -1, count1=0, count2=0, len = arr.length;
		for(int i=0;i<len;i++){
			if(arr[i] == num1)
				count1++;
			else if(arr[i] == num2){
				count2++;
			}
			else if(count1 == 0){
				num1 = arr[i];
				count1 = 1;
			}
			else if(count2 == 0){
				num2 = arr[i];
				count2 = 1;
			}else{
				count1--;
				count2--;
			}
		}

		ArrayList<Integer> ans = new ArrayList<>();
		count1 = 0;
		count2 = 0;

		for(int i=0;i<len;i++){
			if(arr[i] == num1){
				count1++;
			}
			else if(arr[i] == num2){
				count2++;
			}
		}

		if(count1 > len/3)
			ans.add(num1);
		if(count2 > len/3)
			ans.add(num2);

		return ans;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1, 1, 1, 3, 4, 2, 2, 2};
		
		solution1(arr);

		System.out.println("---------------------------------");

		ArrayList<Integer> result = solution2(arr);
		for(int i : result)
			System.out.println(i);

	}
}