package Array;

public class Sort_array_of_0s_1s_and_2s {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        int zeros=0,ones=0,twos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeros++;
            }else if(arr[i]==1){
                ones++;
            }else{
                twos++;
            }
        }
        int j=0;
       for(int i=0;i<zeros;i++)
           arr[j++]=0;
        for(int i=0;i<ones;i++)
            arr[j++]=1;
        for(int i=0;i<twos;i++)
            arr[j++]=2;

        for(int val:arr){
            System.out.print(val+" ");
        }



    }
}
