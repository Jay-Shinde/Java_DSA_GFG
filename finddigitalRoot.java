public class finddigitalRoot {
    public static int digitalRoot(int n)
    {
        // add your code here
        if(n%9==0)return 9;
        if(n<9)return n;
        int result=0;
        while(n>0){
            result=result+n%10;
            n=n/10;
        }
        return digitalRoot(result);
    }
    public static void main(String[] args) {
        System.out.println(digitalRoot(56));
    }
}
