//You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array. 
public class smallestPositiveMissing {
    static int fun(int a[], int n){
        for(int i=0; i<n; i++){
            int ele = a[i];
            
            if(ele>0 && ele<=n){
            int chair = ele-1;
            if(i!=chair && a[i]!=a[chair]){
                a[i]=a[chair];
                a[chair]=ele;
                i--;
            }
            }
        }
        for(int i=0; i<n; i++){
            if(a[i]!=i+1)return i+1;
        }
        return n+1;
    }
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5};
        System.out.println(fun(a, 5));
    }
}
