import java.util.Scanner;

public class infogain {

    static int reverse(int num){
        int tmp = num;
        int ans = 0;
        while(tmp != 0){
            int t = tmp % 10;
            ans = ans*10 + t;
            tmp /= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] temp = new int[n];

        for(int i=0;i<n;i++){
            temp[i] = reverse(arr[i]);
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int p=0,q=0;
        for(int i=0;i<n;i++){
            //min = Math.min(min, temp[i]);
            if(min>temp[i]){
                min = temp[i];
                p = i;
            }

            if(max<temp[i]){
                max = temp[i];
                q = i;
            }
            //max = Math.max(max, temp[i]);
        }


//        for(int val: temp){
//            System.out.print(val+"  ");
//        }

        // first line
        if(p<q){
            System.out.println(arr[p]+" "+arr[q]);
        }else{
            System.out.println(arr[q]+" "+arr[p]);
        }

        // second line
        System.out.println(max-min);
    }
}

/**
 * input
 * n = 10
 * 12 23 34 45 56 67 78 89 100 20
 *
 * output
 * 89 100
 * 97
 */
