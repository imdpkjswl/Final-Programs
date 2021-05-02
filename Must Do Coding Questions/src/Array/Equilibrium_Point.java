package Array;

public class Equilibrium_Point {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,2};
        int sum = 0;
        for(int val:arr){
            sum+=val;
        }
        boolean flag = false;
        int tmp = 0;
        for(int i=0;i<arr.length;i++){
            tmp += arr[i];
            if(sum == tmp){
                System.out.println(i+1);
                flag = true;
                break;
            }
            sum = sum-arr[i];
        }

        if(!flag){
            System.out.println("-1");
        }
    }
}
