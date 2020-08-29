import java.util.*;

public class Find_Pow_x_n {

	private static double findPower(int x, int n) {
		double ans = 1.0;
		long nn = n;
		if (nn < 0) nn = -1 * nn; // make positive.

		while (nn > 0) {
			if (nn % 2 == 1) {  // odd power.
				ans = ans * x;
				nn = nn - 1;
			} else {         // even power.
				x = x * x;
				nn = nn / 2;
			}
		}

		if (n < 0) ans = (double)(1.0) / (double)(ans); // if n given as negative.

		return ans;
	}


	public static void main(String[] args) {
		int x1 = 2;
		int n1 = -3;
		double result1 = findPower(x1, n1);
		System.out.println("pow(" + x1 + "," + n1 + ") =  " + result1);

		int x2 = 3;
		int n2 = 4;
		double result2 = findPower(x2, n2);
		System.out.println("pow(" + x2 + "," + n2 + ") =  " + result2);

	}
}