//Given an array A[] of N positive integers which can contain integers from 1 to P where elements can be repeated or can be absent from the array. Your task is to count the frequency of all elements from 1 to N.
public class freqOfLimRangeArr {
    public static void frequencyCount(int arr[], int N, int P) {
        // code here
        for(int i=0; i<N; i++)
        {
            if(arr[i] > N)
            {
               
                arr[i]=-1;
            }
        }
        //making element of array > N to negative
        
        for(int i=0; i<N; i++)
        {
            if(arr[i] > 0)
            arr[i]--;
        }
        // val become 0 to N-1
        
        for(int i=0; i<N; i++)
        {
            if(arr[i] >= 0){
               if (arr[arr[i]%N] < 0){
                   arr[arr[i]%N]-=N;
               }else
               arr[arr[i]%N]+=N;
            }
                
            
        }
       
        for(int i=0; i<N; i++)
        {
            if(arr[i] >= 0){
            arr[i]/=N;
            }
            else{
                arr[i]/=(-1*N);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 2, 3, 5 };
        int P = 5;
        int n= 5;
        frequencyCount(arr, n, P);
        for(int i=0; i<n; i++)System.out.print(arr[i]);
    }

}
