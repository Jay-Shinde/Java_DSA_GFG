//Given a number N. The task is to check whether it is sparse or not. A number is said to be a sparse number if no two or more consecutive bits are set in the binary representation.
public class isSparese {
    public static boolean isSparse(int n)
    {
        // Your code here
        
       n=(n&(n>>1));
       if(n!=0)return false;
       else return true;
    }
    public static void main(String[] args) {
        System.out.println(isSparse(3));
    }
}
