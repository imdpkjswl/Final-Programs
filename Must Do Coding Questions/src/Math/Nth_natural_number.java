package Math;
/**
 *It is known that, digits of base 2 numbers varies from 0 to 1. Similarly, digits of base 10 numbers varies from 0 to 9.
 *Therefore, the digits of base 9 numbers will vary from 0 to 8.
 *It can be observed that Nth number in base 9 is equal to Nth number after skipping numbers containing digit 9.
 *So the task is reduced to find the base 9 equivalent of the number N.

Follow the steps below to solve the problem:

 * Initialize two variables, say res = 0 and p = 1, to store the number in base 9 and to store the position of a digit.
 * Iterate while N is greater than 0 and perform the following operations:
    * Update res as res = res + p*(N%9).
    * Divide N by 9 and multiply p by 10.
 * After completing the above steps, print the value of res.
 */
public class Nth_natural_number {
        // Function to find Nth number in base 9
        static long findNthNumber(long N) {

            // Stores the Nth number
            long result = 0;

            long p = 1;

            // Iterate while N is greater than 0
            while (N > 0) {

                // Update result
                result += (p * (N % 9));

                // Divide N by 9
                N = N / 9;

                // Multiply p by 10
                p = p * 10;
            }

            // Return result
            return result;
        }


        public static void main(String[] args) {
            int N = 9;
            System.out.print(findNthNumber(N));
        }
}
