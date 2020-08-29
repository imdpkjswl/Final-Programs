// Time complexity: O(n), Space complexity: O(n)
import java.util.*;
/*
If interviewer ask to print any nth row value, use formula:
Row-1          (Row-1)....downgrade to (Col-1)times
	C       =  ------------------------------------  As result will get nth row-col value.
	 Col-1     (Col-1)....downgrade to 1
*/

public class Pascal_Triangle {
	public static void main(String[] args) {

		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> row, pre = null;

		for (int i = 0; i < 5/*numRows*/; i++) {
			row = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					row.add(1);
				} else {
					row.add(pre.get(j - 1) + pre.get(j));
				}
			}
			pre = row;
			res.add(row);
		}

		for (int i = 0; i < res.size(); i++) {
			for (int j = 0; j < res.get(i).size(); j++) {
				System.out.print(res.get(i).get(j) + "  ");
			}
			System.out.println();
		}


	}
}
