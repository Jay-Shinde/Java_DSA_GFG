import java.util.ArrayList;
//Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.
public class ReverseArrInGroups {
     static void fun(ArrayList<Integer> a, int n, int k) {
        
        for(int i=0; i<n-1; i+=k){
            int low=i;
            int high=i+k-1;
            if(high>n-1)high=n-1;
            while(low<high){
                int temp=a.get(low);
                a.set(low, a.get(high));
                a.set(high, temp);
                low++;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(31);
        arr.add(41);
        arr.add(10);
        fun(arr, 5, 2);
        System.out.print(arr);
    }
}
