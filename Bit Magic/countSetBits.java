// 0(1); using Brian Kernighan’s Algorithm
// for(i1to255){ arr[i]=arr[i&(i-1)]+1 }
//function fun has the array which stores values of set bit 
//so each time it will has fix amount time for finding the no 
//of set bits.
public class countSetBits {
    static int fun(int n) {
        int arr[] = new int[256];
        arr[0] = 0;
        for (int i = 1; i < 256; i++) {
            arr[i] = arr[(i & (i - 1))] + 1;
        }
        return arr[n];
    }

    static int no_of_bits(int n) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            count+=fun((n&255));
            n=n>>8;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 511;

        System.out.println(no_of_bits(n));
    }
}
