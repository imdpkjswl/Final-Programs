package Array;

/**
 * Efficient Approach : We know that the factorial of a number:
 * N! = N*(N-1)*(N-2)*(N-3)*****3*2*1
 *
 * The recursive formulae to calculate factorial of a number is:
 * fact(N) = N*fact(N-1).
 */
public class Large_Factorial {

    static int MOD = 1000000007 ; // 10^9 + 7
    static int SIZE = 100000; // 10^5


    // Array to store the factorial values
    // max_element(arr) should be less than SIZE
    static long[] fact = new long[SIZE+1];

    // Function to calculate the factorial using dynamic programing
    static void factorial() {
        fact[0] = 1; // 0!

        for (int i = 1; i <= SIZE; i++) {

            // Calculation of factorial As fact[i-1] stores the factorial
            // of n-1 so factorial of n is fact[i] = (fact[i-1]*i)
            fact[i] = (fact[i-1]*i) % MOD;
        }
    }

    // Function to print factorial of every element of the array
    static void PrintFactorial(int[] arr,int n){
        for(int i = 0; i < n; i += 1) {

            // Printing the stored value of arr[i]!
            System.out.print(fact[arr[i]]+" ");
        }
    }


    public static void main(String[] args) {
        int[] arr = {3, 10, 200, 20, 12};

        // Function to store factorial values mod 10**9+7
        factorial();

        // Function to print the factorial values mod 10**9+7
        PrintFactorial(arr,arr.length);
    }
}



