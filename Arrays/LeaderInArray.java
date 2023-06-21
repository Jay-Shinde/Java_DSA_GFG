import java.util.ArrayList;
import java.util.Collections;

public class LeaderInArray {
    static ArrayList<Integer> fun(int arr[], int n){
        int max_from_right = arr[n-1];
	    ArrayList<Integer> a = new ArrayList<Integer>();
	    a.add(max_from_right);
	    
		for (int i = n-2; i >= 0; i--)
		{
			if (max_from_right <= arr[i])
			{		
			max_from_right = arr[i];
			a.add(max_from_right);
			}
		}
       Collections.reverse(a);
        return a;
    }
    public static void main(String[] args) {
        int A[] = {16,17,4,3,5,2};
        System.out.print(fun(A, 6));
    }
}
