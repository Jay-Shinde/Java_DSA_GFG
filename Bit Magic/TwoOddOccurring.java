//Given an unsorted array that contains even number of occurrences for all numbers except two numbers. Find the two numbers which have odd occurrences in O(n) time complexity and O(1) extra space.

public class TwoOddOccurring {
    static int[] findnum(int[] arr) {
        int n = arr[0];
        for (int i = 1; i < arr.length; i++) { // this forloop for generating value of n which is xor of all numbers in  array.
                                               
            n ^= arr[i];
        }
        // int p=1;
        // for(int i=1; i<=(int)(Math.log(n)/Math.log(2)); i++){
        // //this forloop is for finding last set bit of the value n
        // if((n&1)==1){
        // p<<=(i-1);
        // break;
        // }
        // else n>>=1;
        // }

        int p = (n & (~(n - 1)));
        // this expressin does the same thing that did in above forloop!
        // let n=3 ,(n-1)=2
        // n=0011 n-1 = 0010

        // 0011 n &
        // 1101 ~(n-1)
        // 0001 --->p that's what we want !

        int x = 0, y = 0;
        for (int i = 0; i < arr.length; i++) {
            // further divide the array elements on the basis of pth set and unset bits and
            // XOR them
            if ((arr[i] & p) == 0) { // p th bit is unset
                x ^= arr[i];
            } else { // p th bit is set
                y ^= arr[i];
            }
        }
        int[] res = { x, y };
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 2, 4, 4, 5, 5, 3, 5, 5, 5, 5, 5, 2, 6 };
        int[] result = findnum(arr);
        System.out.println(result[0] + " " + result[1]);
    }
}
