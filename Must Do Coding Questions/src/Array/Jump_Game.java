package Array;

public class Jump_Game {
    static int canReach(int[] arr, int n) {
        int i=0;
        int d = n-1;
        while(i<n){
            int tmp = arr[i];
            if(tmp==0)
                return 0;
            d = d - tmp;
            if(d <= 0)
                return 1;
            i = i + tmp;
        }
        if(d >0)
            return 0;
        return 1;
    }
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1, 2, 0, 3, 0, 0}; // {1,0,2};

        int result = canReach(arr,n);
        if(result==1)
            System.out.println("Reachable");
        else
            System.out.println("Not reachable");
    }
}
