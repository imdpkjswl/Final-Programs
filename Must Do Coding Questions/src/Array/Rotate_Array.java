package Array;

public class Rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 2;

        for(int i=0;i<d;i++){
            int tmp = arr[0];
            for(int j=0;j< arr.length-1;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = tmp;
        }

        for(int val: arr){
            System.out.print(val+"  ");
        }
    }
}
