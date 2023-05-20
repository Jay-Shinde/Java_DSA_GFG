//You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.

public class bitDifference {
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int x=a^b;
        int count=0;
        while(x!=0){
            x=(x&(x-1));
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int a=10, b=20;
        System.out.println(countBitsFlip(a,b));
    }
}
