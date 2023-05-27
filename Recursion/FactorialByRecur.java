public class FactorialByRecur {
    static int fac(int n){
        if(n==0)return 1;
        return fac(n-1)*n;
    }
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
