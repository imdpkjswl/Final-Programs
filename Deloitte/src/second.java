import java.util.*;

public class second {
    static int diagonalSum(int m, int n, int[][] arr){
        int s1=0;
        int s2=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    s1 += arr[i][j];
                }
                if(i==n-j-1){
                    s2 += arr[i][j];
                }
            }
        }

        return Math.abs(s1-s2);
    }

    static int
    public static void main(String[] args) {
        int m, n;
        // m = 3, n = 3;
        int[][] a1 = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // m = 2, n = 3;
        int[][] a2 = new int[][]{
                {1,2,3},
                {4,5,6}
        };

        // m = 3, n = 2;
        int[][] a3 = new int[][]{
                {1,2},
                {3,4},
                {5,6}
        };




    }
}
