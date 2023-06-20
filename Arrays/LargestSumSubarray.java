
public class LargestSumSubarray {
    static int fun(int arr[]){
        int LargeSum=-11111;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(LargeSum<sum)LargeSum=sum;
            if(sum<0)sum=0;
        }
        return LargeSum;
    }
    public static void main(String[] args) {
        int[] arr = {4,-5,-3,-33,1, 4, -1, 5, -1, -5};
        System.out.println(fun(arr));
    }
    
}