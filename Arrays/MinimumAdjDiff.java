public class MinimumAdjDiff {
    public static int minAdjDiff(int a[], int n) {
        
        // Your code here
        int min=Math.abs(a[0]-a[1]);
        for(int i=1; i<n; i++){
           if(i==(n-1)){
               min=Math.min(min, Math.abs(a[i]-a[0]));
           }else{
               min=Math.min(min, Math.abs(a[i]-a[i+1]));
           }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {8,-8,9,-9,10,-11,12};
        System.out.println(minAdjDiff(arr, arr.length));
    }
}
