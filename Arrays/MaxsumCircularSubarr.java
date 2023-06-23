// we follow following steps:
//   I] find normal subarray maximum sum 
//   II]if the maxsum is negative then return the Maxsum
//   III]else find total sum of the array elements and subtract subarray with minimum sum  from it
//   -to do this using maxsum subarray fun , we first negate the array and find the sum and then add it to the total sum 
//     : totalsum-(min sum of array)
//     = totalsum-(-1*(max sum of -ve array))
//     = totalsum+(max sum of -ve array)
//   IV] take maximum value between step III] and I]
public class MaxsumCircularSubarr {
    static int maxsum(int a[], int n){
        int cur=a[0];
        int max=a[0];
        for(int i=1; i<n; i++){
            cur=Math.max(a[i], cur+a[i]);
            max=Math.max(max, cur);
        }
        return max;
    }
    
    
    //maxsum of circular subarray
    static int circularSubarraySum(int a[], int n) {
        // Your code here
        int max=maxsum(a, n);
        if(max<0)return max;
        int sum=0;
        for(int i=0; i<n; i++){
            sum+=a[i];
            a[i]*=-1;
        }
        max=Math.max(max, sum+maxsum(a,n));
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {8,-8,9,-9,10,-11,12};
        System.out.println(circularSubarraySum(arr, arr.length));
    }
}
