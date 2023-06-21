

public class checkIFsortedandRotated {
    static boolean fun(int a[], int n){
        int l=0;
        for(int i=1; i<n; i++){
            if(a[l]<a[i])l=i;
        }
        if(a[(l-1+n)%n]>a[(l+1+n)%n]){
            if(l==n-1)return false;
            int i=1;
            while(i<n-1){
                if(a[(l+i)%n]<a[(l+i+1)%n]){
                    i++;
                    continue;
                }
                return false;
            }
            return true;
        }
        else{
            if(l==0)return false;
            int i=1;
            while(i<n-1){
                if(a[(l+i)%n]>a[(l+i+1)%n]){
                    i++;
                    continue;
                }
                return false;
            }
            return true;
        }
        
    }
    public static void main(String[] args) {
        int[] arr={3,4,1,2};
        System.out.println(fun(arr, 4));
    }
}
