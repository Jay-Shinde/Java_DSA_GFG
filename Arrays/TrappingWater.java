public class TrappingWater {
    static long fun(int a[], int n){
        long result=0;
        int Lmax[] = new int[n];
        Lmax[0]=a[0];
        int Rmax[] = new int[n];
        Rmax[n-1]=a[n-1];
        
        //create Lmax array
        for(int i=1; i<n; i++){
            if(a[i]<a[i-1])Lmax[i]=Lmax[i-1];
            else Lmax[i]=a[i];
        }
        
        // create Rmax array
        for(int i=n-2; i>=0; i--){
            if(a[i]>Rmax[i+1])Rmax[i]=a[i];
            else Rmax[i]=Rmax[i+1];
        }
        
        //adding to result
        for(int i=1; i<n-1; i++){
            result+=Math.min(Rmax[i], Lmax[i])-a[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {3,0,0,2,0,4};
        int n=6;
        System.out.println(fun(arr, n));
    }
}
