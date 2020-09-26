import java.util.*;

/*
public class Four_Sum_Problem {

   public static ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
    // O(n^3) Time complexity & O(n^2) Auxiliary Space solution
    		int N = num.length;
	    	Arrays.sort(num);
	    	HashSet<ArrayList<Integer>> hSet = new HashSet<ArrayList<Integer>>();
	    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		    
		    for (int i = 0; i < N; i++) {
		        for (int j = i + 1; j < N; j++) {
		            for (int k = j + 1, l = N - 1; k < l;) { //using two pinter technique

		                int sum = num[i] + num[j] + num[k] + num[l];
		                
		                if (sum > target) {
		                    l--;
		                }
		                else if (sum < target) {
		                    k++;
		                }
		                else if (sum == target) {
		                    ArrayList<Integer> found = new ArrayList<Integer>();
		                    found.add(num[i]);
		                    found.add(num[j]);
		                    found.add(num[k]);
		                    found.add(num[l]);
		                    if (!hSet.contains(found)) {
		                        hSet.add(found);
		                        result.add(found);
		                    }

		                    k++;
		                    l--;

		                }
		            }
		        }
		    }
    	return result;
	}

	public static void main(String[] args) {
		int n = 8;
		int[] nums = new int[]{1, 2, 1, 3, 2, 3, 4, 4, 2};
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
*/