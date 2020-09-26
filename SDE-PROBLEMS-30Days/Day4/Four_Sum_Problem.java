import java.util.*;


public class Four_Sum_Problem {

   public static ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
    // O(n^4) Time complexity & O(n^2) Auxiliary Space solution
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

	public static void main(String[] args) {
		int n = 8;
		int[] nums = new int[]{1,2,1,3,4,3,1,4,2,4};
		int target = 9;

		ArrayList<ArrayList<Integer>> arr = fourSum(nums, target);

		System.out.println("The unique four sum quadruplets are:");
		for(int i=0;i<arr.size();i++){
			for(int j=0;j<arr.get(i).size();j++){
				System.out.print(" -> "+arr.get(i).get(j));
			}
			System.out.println();
		}		
		
	}
}

