import java.util.*;

public class Leaky_Bucket_Algorithm {
        static int min(int x, int y)
        {
            if(x < y)
                return x;
            else
                return y;
        }

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);

            int[] input_packets;
            int count = 0;
            int time_limit;
            int minimum;
            int bucket_size;
            int output_rate;
            int packets_dropped = 0;
            int temp = 0;

            System.out.println("Enter The Bucket Size");
            bucket_size = s.nextInt();

            System.out.println("Enter The Output Rate");
            output_rate = s.nextInt();

            System.out.println("Enter The Time Period In Seconds For Which You Would Like To Carry Out Simulation");
            time_limit = s.nextInt();

            input_packets = new int[time_limit];

            for(int i = 0; i < time_limit; i++)
            {
                System.out.println("Enter The Size Of Packet Which Would Arrive At Second "+(i+1)+": ");
                input_packets[i] = s.nextInt();
            }

            System.out.println("Second\t|\tPackets Received\t|\tPackets Sent\t|\tPackets Left\t|\tPackets Dropped");

            for(int i = 0; i < time_limit; i++)
            {
                count += input_packets[i];

                if(count > bucket_size)
                {
                    packets_dropped = count - bucket_size;
                    count = bucket_size;
                }

                System.out.print("\t"+(i+1) + "\t|\t\t\t");
                System.out.print(input_packets[i] + "\t\t\t|\t\t\t");

                minimum = min(count, output_rate);
                count = count - minimum;

                System.out.print(minimum + "\t\t|\t\t\t");
                System.out.print(count + "\t\t|\t\t\t");
                System.out.println(packets_dropped);
                packets_dropped = 0;
                temp = i;
            }

            for(int i = temp + 1; count != 0; i++)
            {
                
                if(count > bucket_size)
                {
                    packets_dropped = count - bucket_size;
                    count = bucket_size;
                }

                System.out.print("\t"+(i+1) + "\t|\t\t\t");
                System.out.print(0 + "\t\t\t|\t\t\t");

                minimum = min(count, output_rate);
                count = count - minimum;

                System.out.print(minimum + "\t\t|\t\t\t");
                System.out.print(count + "\t\t|\t\t\t");
                System.out.println(packets_dropped);
            }
        }
}
