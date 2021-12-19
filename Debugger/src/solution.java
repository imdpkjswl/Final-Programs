import java.util.*;
import java.io.*;
/*
class solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String s = br.readLine(); // read whole line
            String[] s1 = s.split(" "); // separate line by space

            long X = Integer.parseInt(s1[0]);
            long Y = Integer.parseInt(s1[1]);

            long res = (1*X) + (2*Y);

            if((res%2)==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

    }
}
 */


class solution{
    static void swap(char[] c, int i, int j){
        char tmp  = c[i];
        c[i] = c[j];
        c[j] = tmp;

    }
    public static void main(String[] args) {
        String str = "deepak";
        char[] chr = str.toCharArray();

        int n = str.length();

        int i=0, j = n-1;

        while(i<j){
            swap(chr, i++, j--);
        }

        System.out.println(chr);
    }
}