import java.time.chrono.MinguoChronology;

/**
 * binarySort
 */
public class binarySort {
static int searchInSorted(int a[], int n, int k)
    {
        
        // Your code here
        int low=0, high=n-1;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==k)return 1;
            else if(a[mid]<k)low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
   public static void main(String[] args) {
    int[] arr = { 3, 5, 7, 9, 10, 90,
					100, 130, 140, 160, 170 };
		int target = 10;
		// Function call
		int ans = searchInSorted(arr,arr.length, target);
		if (ans == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at index "
							+ ans);
   } 
}