
//Lucky numbers are subset of integers. Rather than going into much theory, let us see the process of arriving at lucky numbers,

public class LuckyNo{
    
    static boolean isLucky1(int n, int counter){
        if(n%counter==0)return false;
        if(counter>n)return true;
        int x=n-n/counter;
        counter++;
        if(x%counter==0)return false;
        return isLucky1(x, counter);
    }
    public static void main(String[] args) {
        int n=19;
        System.out.println(isLucky1(n, 2));
    }
}
