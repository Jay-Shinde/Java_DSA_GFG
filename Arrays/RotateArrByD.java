public class RotateArrByD {
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        rev(arr, d-1, 0);
        rev(arr, n-1, d);
        rev(arr, n-1, 0);
    }
    static void rev(int arr[], int high, int low){
        int temp=0;
        while(high>low){
            temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            high--;
            low++;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        rotateArr(arr, 2, 5);
        for(int i=0; i<arr.length; i++)System.out.print(arr[i]+" ");
    }

}
