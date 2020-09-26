import java.util.*;

/*
class Solution { // O(n^4) Time complexity & O(n^2) Auxiliary Space solution
   public static ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
    
    		int N = num.length;
    		Arrays.sort(num);
	    	HashSet<ArrayList<Integer>> hSet = new HashSet<ArrayList<Integer>>();
	    	
	    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		    
		    for (int i = 0; i < N-3; i++) {
		        for (int j = i + 1; j < N-2; j++) {
		            for (int k = j + 1; k < N-1; k++) { 
		            	for(int l = k+1; l < N; l++) {
			                int sum = num[i] + num[j] + num[k] + num[l];
			             
			                if (sum == target) {
			                    ArrayList<Integer> quad = new ArrayList<Integer>();
			                    quad.add(num[i]);
			                    quad.add(num[j]);
			                    quad.add(num[k]);
			                    quad.add(num[l]);
		                    	if (!hSet.contains(quad)) {
		                        	hSet.add(quad);
		                        	result.add(quad);
		                    	}
			                }
			            }
		            }
		        }
		    }
    	return result;
	}
}
*/



class Solution { // O(n^3) Time complexity & O(n) Auxiliary Space solution
   public static ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
    		
    		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

    		if(num == null || num.length==0)
    			return result;
    		int N = num.length;
    		Arrays.sort(num);
	    	
		    
		    for (int i = 0; i < N; i++) {
		        for (int j = i + 1; j < N; j++) {
		            	
		            	int target_2 = target - num[i] - num[j]; // remaining target value
		            	
		            	int left = j+1;
		            	int right = N-1;

			                while (left < right) {
			                	// using two sum problem 
			                	int two_sum = num[left] + num[right];  

			                	if(two_sum < target_2) left++;

			                	else if(two_sum > target_2) right--;

			                	else{
				                    ArrayList<Integer> quad = new ArrayList<Integer>();
				                    quad.add(num[i]);
				                    quad.add(num[j]);
				                    quad.add(num[left]);
				                    quad.add(num[right]);

				                    result.add(quad);

				                    //Processing the duplicates of number 3
				                    while( left < right && num[left] == quad.get(2)) ++left;

				                    //Processing the duplicates of number 4
				                    while(left < right && num[right] == quad.get(3)) --right;

				                }
			            	}
			        //Processing the duplicates of number 2
			        while(j+1 < N && num[j+1] == num[j]) ++j;        	
		        }
		        	//Processing the duplicates of number 1
		        	while(i+1 < N && num[i+1] == num[i]) ++i;
		    }
    	return result;
	}
}

public class Four_Sum_Problem {
	public static void main(String[] args) {
		int n = 8;
		int[] nums = new int[]{1,2,1,3,4,3,1,4,2,4};
		int target = 9;

		Solution obj = new Solution();
		ArrayList<ArrayList<Integer>> arr = obj.fourSum(nums, target);

		System.out.println("The unique four sum quadruplets are:");
		for(int i=0;i<arr.size();i++){
			for(int j=0;j<arr.get(i).size();j++){
				System.out.print(" -> "+arr.get(i).get(j));
			}
			System.out.println();
		}		
		
	}
}

