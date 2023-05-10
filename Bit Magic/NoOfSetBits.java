
public class NoOfSetBits {
    static int no_of_bits(int n){
        int a=1;
       int  counter=0;
        while(n!=0){
            // n=n-Math.pow(2, Math.log(n)/Math.log(2));
            a=(int)(Math.log(n)/Math.log(2));
            n=n-(int)Math.pow(2, a);
            counter++;
        }
        return counter;
        

    }
    public static void main(String[] args) {
        int n=64;
        System.out.println(no_of_bits(n));;
    }
    
}