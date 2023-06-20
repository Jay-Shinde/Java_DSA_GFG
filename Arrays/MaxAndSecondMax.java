import java.util.ArrayList;

public class MaxAndSecondMax {
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        ArrayList<Integer> result = new ArrayList<Integer>(2);
         int[] ar=new int[2];
        ar[0]=-1;
        ar[1]=arr[0];
        for(int i=1; i<sizeOfArray; i++){
            if(ar[1]<arr[i]){
                ar[0]=ar[1];
                ar[1]=arr[i];
            }
            else if(ar[1]!=arr[i]){
                if(ar[0]==-1 || ar[0]<arr[i]){
                    ar[0]=arr[i];
                }
                
            }
        }
        result.add(ar[1]);
        result.add(ar[0]);
        return result;
        
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,5,4,6,7};
        System.out.print(largestAndSecondLargest(array.length, array));
    }
}
