import java.util.HashSet;
import java.util.Scanner;

// Shetty- Hexaware Package Upgrade coding question's solution

/**
// Remove non-sqrt elements
public class HexawareUpgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int z = (int) Math.sqrt(arr[i]);
            if(z*z == arr[i]){
                System.out.print(arr[i] +" ");
            }
        }

        // Set
        HashSet<Character> s = new HashSet<>();
    }
}
 // Input:
 // n = 4
 // 8 16 12 9

 // Output
 // 16 9
*/


/**
 // Most frequent
public class HexawareUpgrade {

    static int countFreq(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        int res = 0;

        // A loop to slide pat[] one by one
        for (int i = 0; i <= N - M; i++) {
            // For current index i, check for pattern match
            int j;
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
            if (j == M) {
                res++;
                j = 0;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        String k;
        k = sc.next();
        n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }

        int len=0;
        int count =0;
        String ans = "";

        if(arr.length==0){
            System.out.println(-1);
        }else{
            for(int i=0;i<n;i++){
                len = countFreq(k,arr[i]);
                if(len>count){
                    count = len;
                    ans = arr[i];
                }
            }
        }

        if(count==0){
            System.out.println("0");
        }else{
            System.out.println(ans);
        }

    }
}

 // Input
 // k = 2
 // n = 5
 // 12 37 1213 2322 12

 // Output
 // 2322
*/