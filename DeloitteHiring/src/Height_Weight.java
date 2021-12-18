import java.util.*;

public class Height_Weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for(int i=0;i<n;i++) {
            float h = sc.nextFloat();
            float w = sc.nextFloat();

            int flag = 1;
            if (h >= 4.3 && h <= 6.9) {
                if (h >= 4.3 && h <= 5.5)
                    flag = 1;
                else
                    flag = 2;
                float t = h * 12;
                if (w >= (t - 5) && w <= (t + 5) && flag == 2)
                    System.out.println("2");
                else System.out.println("1");
            } else System.out.println("0");
        }
    }
}

/**  n
 *   h  w
 *   Result
 *
 * 3
 * 3.9 40.9
 * 0
 *
 * 5.7 70.5
 * 2
 *
 * 4.7 58.5
 * 1
 */