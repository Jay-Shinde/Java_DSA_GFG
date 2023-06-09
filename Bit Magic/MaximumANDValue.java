//Given an array arr[] of N positive elements. The task is to find the Maximum AND Value generated by any pair(arri, arrj) from the array such that i != j.
//Note: AND is bitwise '&' operator.

// approach :

//Create a variable res to store the final answer.
// Traverse a loop from 31 to 0 to see if there are more than two elements in the array whose AND with res equals res if we add the current bit to res and keep updating res.
// Return res as the final answer
public class MaximumANDValue {
    public static int checkbit(int pattern, int[] arr, int n){
        int count=0;
        for(int i=0; i<n; i++){
            if((pattern&arr[i])==pattern){
                count+=1;
            }
        }
        return count;
      
         
     }
      public static int maxAND (int arr[], int N) {
  
          int count=0, res=0;
          for(int i=31; i>=0; i--){
           count = checkbit(res|(1<<i), arr, N);
           if(count>=2){
               res|=(1<<i);
           }
           
          }
          return res;
        
      }
    public static void main(String[] args) {
        int[] arr = {16,4,8,12};
        System.out.println(maxAND(arr, arr.length));
    }
}
