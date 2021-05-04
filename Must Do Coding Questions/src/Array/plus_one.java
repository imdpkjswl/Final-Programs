package Array;

import java.util.ArrayList;

/*
Runtime Error:
Runtime ErrorTime Limit Exceeded

Your program took more time than expected.Time Limit Exceeded
Expected Time Limit 12.03sec
Hint : Please optimize your code and submit again.
 */
public class plus_one {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(9); arr.add(9); arr.add(9); // output: 1 0 0 0

        if(arr.get(arr.size()-1)< 9){
            arr.set(arr.size()-1, arr.get(arr.size()-1)+1);
        }else{
            int i;

            for(i=arr.size()-1;i>=0;i--){
                if(arr.get(i) == 9){
                    // Make zero except first element
                    if(i != 0)
                        arr.set(i,0);
                    // Handling least significant element
                    if(arr.get(i)==9 && i==0){
                        int n = arr.size();

                        arr.clear();
                        arr.add(1);
                        for(int j=0;j<n;j++){
                            arr.add(0);
                        }
                        break;
                    }
                }else if(arr.get(i)<9){
                    arr.set(i, arr.get(i)+1);
                    break;
                }
            }
        }

        for(int val:arr){
            System.out.print(val+"  ");
        }
    }
}
