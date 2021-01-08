import java.util.*;

public class CyclicRedundancyCheck {
        static void divide_to_find_remainder(int[] a, int k) {
            int[] gp = {1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1};  //Generator Polynomial: x^16 + x^12 + x^5 + x^0 Of Length 17
            int count = 0;

            for(int i = 0; i < k; i++)
            {
                if(a[i] == gp[0])
                {
                    for(int j = i; j < 17 + i; j++)
                    {
                        a[j] = a[j] ^ gp[count++];
                    }
                    count = 0;
                }
            }

            System.out.print("Remainder obtained: ");
            for(int i = 0; i < 20; i++)  // can be used: 17+k
            {
                System.out.print(a[i]+ " ");
            }
            System.out.println();

        }

        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);

            int a[] = new int[100], b[] = new int[100], len, k;
            boolean flag = true;

            System.out.print("Enter the length of data frame: ");
            len = s.nextInt();

            System.out.print("Enter the message present within the data frame bit by bit: ");
            for(int i = 0; i < len; i++)
            {
                a[i] = s.nextInt();             // Accepting Input Message
            }

            for(int i = 0; i < 16; i++)
            {
                a[len++] = 0;                   // Appending Zero's (n-1)
            }

            k = len - 16;   // perform k times division

            for(int i = 0; i < len; i++)
            {
                b[i] = a[i];    // copy into another array
            }

            divide_to_find_remainder(a, k);  // to get Remainder Obtained used



            for(int i = 0; i < len; i++)
            {
                a[i] = a[i] ^ b[i];             // Adding Remainder To The Given Input Message To Generate CRC Code
            }

            System.out.print("Data to be transmitted is: ");
            for(int i = 0; i < len; i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.println();


            System.out.print("Enter the received data bit by bit: ");
            for(int i = 0; i < len; i++)
            {
                a[i] = s.nextInt();
            }

            divide_to_find_remainder(a, k);

            for(int i = 0; i < len; i++)
            {
                if(a[i] != 0)
                {
                    flag = false;
                    break;
                }
            }

            if(!flag)
                System.out.println("Error occurred during transmission.");
            else
                System.out.println("No error during transmission.");
        }
}
