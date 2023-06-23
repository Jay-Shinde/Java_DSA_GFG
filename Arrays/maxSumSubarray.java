//using Kadane's Algo

public class maxSumSubarray {
    static int sum(int a[]){
        int max=a[0];
        int cur=a[0];
        for(int i=1; i<a.length; i++){
            cur=Math.max(a[i], a[i]+cur);
            max=Math.max(cur, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int a[]={4,-5,-3,-33, 1,-1, -5, -1, -5};
        System.out.println(sum(a));
    }
}
