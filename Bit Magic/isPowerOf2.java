public class isPowerOf2 {
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if(n==0)return false;
        if((n&(n-1))==0)return true;
        else return false;
    }
    public static void main(String[] args) {
        int n=64;
        System.out.println(isPowerofTwo(n));
    }
}
