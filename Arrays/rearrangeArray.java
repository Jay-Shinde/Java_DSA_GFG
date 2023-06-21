// Given an array arr[] of size N where every element is in the range from 0 to n-1. Rearrange the given array so that the transformed array arrT[i] becomes arr[arr[i]].

// NOTE: arr and arrT are both same variables, representing the array before and after transformation respectively.
// Input:
// N = 5
// arr[] = {4,0,2,1,3}
// Output: 3 4 2 0 1
// Explanation: 
// arr[arr[0]] = arr[4] = 3.
// arr[arr[1]] = arr[0] = 4.
// and so on.
public class rearrangeArray {
    static void fun(int a[], int n){
        for(int i=0; i<n; i++){
            a[i]=(a[(int)a[i]]%n)*n+a[i];
        }
        for(int i=0; i<n; i++){
            a[i]=a[i]/n;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,0,2,1,3};
        fun(arr, 5);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
