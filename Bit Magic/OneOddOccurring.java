//Given an array of positive integers. All numbers occur an even number of times except one number which occurs an odd number of times. Find the number in O(n) time & constant space.

//The Best Solution is to do bitwise XOR of all the elements. XOR of all elements gives us odd occurring elements. 

// x^0 = x
// x^x=0

public class OneOddOccurring {
    static int findnum(int[] arr){
        int n=arr[0];
        for(int i=1; i<arr.length; i++){
            n ^=arr[i];
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,4,4,4,5,5};
        System.out.println(findnum(arr));
    }
}
