// Given a rope of length N meters, and the rope can be cut in only 3 sizes A, B and C. The task is to maximizes the number of cuts in rope. If it is impossible to make cut then print the number else print -1. Examples:

// Input: 
// N = 17, A = 10, B = 11, C = 3 
// Output: 3

public class RopeCuts {
    public static int maxCuts(int n, int a, int b, int c){
        if(n==0)return 0;
        if(n<0)return -1;
        int result= Math.max(maxCuts(n-a, a, b, c), Math.max(maxCuts(n-b, a, b, c), maxCuts(n-c, a, b, c)));
        if(result == -1)return -1;
        else return result+1;
    }
    public static void main(String[] args) {
        System.out.println(maxCuts(45, 9, 9, 9));
    }
}
