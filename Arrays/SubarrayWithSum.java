public class SubarrayWithSum {
    static void fun(int a[], int sum){
        int start=0;
        int cursum=0;
        int res[]={-1,-1};
        for(int i=0; i<a.length; i++){
            cursum+=a[i];
            if(cursum==sum){
                res[0]=start;
                res[1]=i;
            }
            else if(cursum>sum){
                cursum-=(a[start]+a[i]);
                start++;
                i--;
            }
        }
        System.out.print(res[0]+" "+res[1]);
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,8};
        int sum=14;
        fun(a, sum);
    }
}
