import java.util.*;

public class first {
    private static int dj(int[] arr, int n) {
        int ans=0;
        int m = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            m = Math.min(m, arr[i]);
        }

        for(int val:arr){
            if(m==val){
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = 12;
        int[] arr = new int[]{2,4,6,1,3,2,2,3,2,6,3,1};

        System.out.println(dj(arr,n));
    }
}
