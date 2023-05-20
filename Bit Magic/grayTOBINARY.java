public class grayTOBINARY {
    public static int grayToBinary(int n) {
        
        // Your code here
        int res = n;
 
        while (n > 0) {
            n >>= 1;
            res ^= n;
        }
 
        return res;
    }
    public static void main(String[] args) {
        System.out.println(grayToBinary(4));
    }
}
