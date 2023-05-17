//problem is to find all set bits til given number n 
// here we have used the formula recurrsively for solving the problem
// formula => (x*2^x-1)+(n-(2^x)-1)+countSetBits(n-2^x)

/**
 * countAllsetBitstillN
 */
public class countAllsetBitstillN {

    public static int countSetBits(int n){
    
        // Your code here
        if(n==0)return 0;
        if(n==1)return 1;
        int x=n;
        int count=0;
        while(x!=0){
            x>>=1;
            count+=1;
        }
        count-=1;
        return (count*(int)Math.pow(2, count-1))+(n-(int)Math.pow(2, count)+1)+countSetBits(n-(int)Math.pow(2, count));
        
    }
    public static void main(String[] args) {
        int n = 17;
        System.out.println(countSetBits(n)); 
    }
}