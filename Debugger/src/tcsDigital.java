import java.util.*;

public class tcsDigital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N;
        int M;

         N = sc.nextInt();
         M = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int start= -1;
        int end= -1;
        boolean flag = false;
        for(int i=0;i<N;i++){
            if(!flag && arr[i] == M){
                start = i;
                flag = true;
            }
            if(arr[i]==M){
                end = i;
            }
        }

        if(start == -1){
            System.out.println("Not found");
        }else{
            System.out.println(start+" "+end);
        }

    }
}
