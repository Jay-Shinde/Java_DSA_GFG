public class SumofNnatural {
    static int sumofN(int n){
        if(n==0)return 0;
        return n+sumofN(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumofN(8));
    }
}
