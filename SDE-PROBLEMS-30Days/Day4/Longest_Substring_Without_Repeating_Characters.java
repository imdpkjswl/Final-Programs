import java.util.*;

public class Longest_Substring_Without_Repeating_Characters{
	// Time complexity: O(N) & Auxiliary Space: O(N)	
	private static int solution(String str){
		HashMap<Character, Integer> map = new HashMap<>();

		int left =0, right =0;
		int n = str.length();
		int len = 0;

		while(right < n){
			if(map.containsKey(str.charAt(right))){ // check character does exist at right index in map
				left = Math.max(map.get(str.charAt(right))+1, left); // make jump left to right+1 
			}
			
			map.put(str.charAt(right), right); // update the last seen
			len = Math.max(len, right - left +1); // compute length
			right++; 	
			

		}

		return len;
	}

	public static void main(String[] args){

		String str = "abcaabcdba";

		int result = solution(str);
		System.out.println(result);


	}
}