import java.util.*;

public class Count_number_of_subarray_with_given_XOR{
	// Time complexity: O(NLogN) & Auxiliary Space: O(N)	
	private static int solution(int[] A, int B){
		HashMap<Integer, Integer> freq = new HashMap<>();
		int cnt = 0;
		int xorr = 0;
		int n = A.length;

		for(int i=0;i<n;i++){
			xorr = xorr ^ A[i]; // take prefix xor
			
			if(freq.get(xorr ^ B) != null){
				cnt += freq.get(xorr ^ B);
			}
			
			if(xorr == B){
				cnt++;
			}

			if(freq.get(xorr) != null)
				freq.put(xorr, freq.get(xorr)+1);
			else
				freq.put(xorr, 1);
		}

		return cnt;
	}

	public static void main(String[] args){

		int[] arr = new int[]{4, 2, 2, 6, 4};
		int m = 6;

		int result = solution(arr, m);
		System.out.println(result);


	}
}