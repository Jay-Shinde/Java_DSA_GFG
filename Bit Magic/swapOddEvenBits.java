//Given an unsigned integer N. The task is to swap all odd bits with even bits. For example, if the given number is 23 (00010111), it should be converted to 43(00101011). Here, every even position bit is swapped with an adjacent bit on the right side(even position bits are highlighted in the binary representation of 23), and every odd position bit is swapped with an adjacent on the left side.
public class swapOddEvenBits {
    public static int swapBits(int n) {
        // Your code
        int onlyOdds = n & 0x55555555;
        int onlyEvens = n & 0xAAAAAAAA;
        return (onlyOdds << 1) | (onlyEvens >> 1);

    }

    public static void main(String[] args) {
        int a = 23;
        System.out.println(swapBits(a));
        
    }
}
