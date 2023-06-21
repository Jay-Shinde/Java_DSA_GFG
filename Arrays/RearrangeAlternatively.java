// Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
// Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.
public class RearrangeAlternatively {
    public static void rearrange(int arr[], int n){
        
        // Your code here
        int temp=n-1;
        int h=arr[n-1]+1;
        for(int i=0; i<n; i+=2){
            arr[i]=(arr[temp]%h)*h+(arr[i])%h;
            temp--;
        }
        temp=0;
        for(int i=1; i<n; i+=2){
            arr[i]=(arr[temp]%h)*h+(arr[i])%h;
            temp++;
            
        }
        for(int i=0; i<n; i++){
            arr[i]=arr[i]/h;
        }
        
        
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90,100,110};
        int n=11;
        rearrange(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
