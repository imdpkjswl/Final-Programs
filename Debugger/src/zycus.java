import java.util.*;

/**
 * PERFORM THREE SET OF QUERIES
 * 1. Reverse
 * 2. Swap ith and jth index
 * 3. print index of given value(x)
 *
 * Input:
 * N = 4
 * arr[] = 1 2 3 4
 * Q = 4
 * Queries = [[2,2,4], [3,2,0], [1,0,0], [3,1,0]]
 *
 * Output:
 * xprint = [4, 4]
 */
public class zycus {
    static Scanner sc = new Scanner(System.in);
    static int N;
    static int[] arr;

    static void reverse(){
        int start =0;
        int end = N-1;
            while (start < end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }

    static void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void xprint(int x){
        for(int index=0;index<N;index++){
            if(x == arr[index]){
                System.out.print((index+1)+" "); // return index
            }
        }
    }

    public static void main(String[] args) {

        N = sc.nextInt();
        arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }

        int Q = sc.nextInt();
        int queries[][] = new int[Q][3];

        for(int i=0;i<Q;i++){
            for(int j=0;j<3;j++){
                queries[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<Q;i++){
                if(queries[i][0]==1){
                    reverse();
//                    for(int val:arr){
//                        System.out.print(val+" ");
//                    }
                }else if(queries[i][0]==2){
                    swap(queries[i][1]-1, queries[i][2]-1);
//                    System.out.println();
//                    for(int val:arr){
//                        System.out.print(val+" ");
//                    }
//                    System.out.println();
                }else if(queries[i][0]==3){
//                    for(int val:arr){
//                        System.out.print(val+" ");
//                    }
//                    System.out.println("\nAnswer");
                    xprint(queries[i][1]);
                }
        }


    }
}
