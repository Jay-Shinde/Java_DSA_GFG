//Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers.
public class Rightmostdifferentbit {
    static int pos(int m, int n){
        //Function to find the first position with different bits.
   // Your code here
   if(m==n)return -1;
   int a = m^n;
   
   return (int)(Math.log(a&(~(a-1)))/Math.log(2))+1;
    }
public static void main(String[] args) {
    System.out.println(pos(11, 3));
}
}
