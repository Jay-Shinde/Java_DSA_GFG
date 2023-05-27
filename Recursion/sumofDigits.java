public class sumofDigits {
    static int sum(int n){
        if(n<=9)return n;
        return (n%10)+sum(n/10);
    }
   public static void main(String[] args) {
    System.out.println(sum(99999));
   } 
}
