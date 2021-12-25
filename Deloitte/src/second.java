import java.util.*;

public class second {
    public static HashSet<Integer> set = new HashSet<>();

    /**
     * @param m --> Row
     * @param n --> Column
     * @param arr --> Square matrix
     * @return sum
     */
    static int diagonalSum(int m, int n, int[][] arr){

        for(int p=0;p<n;p++){
            for(int q=0;q<n;q++){
                System.out.print(arr[p][q]+" ");
            }
            System.out.println();
        }
        // Store all element to sets except diagonal elements
        for(int i=0;i<m;i++){for(int j=0;j<n;j++){
                if(i!=j){
                    set.add(arr[i][j]);
                } }
        }

        int sum=0;
        for(int i=0;i<m;i++){for(int j=0;j<n;j++){
                if(i==j) { if(set.contains(arr[i][j])){
                        sum += arr[i][j];
                }}
            }
        }
        return sum;
    }

    static int solution(int m, int n, int[][] arr){
        if(m==n){
            return diagonalSum(m, n, arr);
        }

        else if(m<n){
            int i;
            int[][] tmp = new int[n][n]; // make square matrix
            for(i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i<m) {
                        tmp[i][j] = arr[i][j];
                    }else{
                        tmp[i][j] = 1;
                    }
                }
            }
            return diagonalSum(n,n,tmp);
        }

        else {
            int i;
            int[][] tmp = new int[m][m]; // make square matrix
            for (i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    if (j < n) {
                        tmp[i][j] = arr[i][j];
                    } else {
                        tmp[i][j] = 1;
                    }
                }
            }
            return diagonalSum(m, m, tmp);
        }

    }

    public static void main(String[] args) {
        int m, n;
        /*m = 3; n = 3;
        int[][] a1 = new int[][]{
                {1,2,3},
                {4,5,6},
                {1,8,9}
        };*/

        //System.out.println(solution(m,n,a1));

        /*m = 2; n = 3;
        int[][] a2 = new int[][]{
                {1,2,3},
                {4,5,6}
        };*/

        //System.out.println(solution(m,n,a2));

        m = 3; n = 2;
        int[][] a3 = new int[][]{
                {1,2},
                {3,4},
                {4,6}
        };

        System.out.println(solution(m,n,a3));

    }
}
