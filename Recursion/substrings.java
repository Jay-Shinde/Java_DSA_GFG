//Given a set represented as a string, write a recursive code to print all the subsets of it. The subsets can be printed in any order.
public class substrings {
    static void subs(String s, String cur, int index){
        
    if(index == s.length()){
        System.out.println(cur);
        return;
    }

        
        subs(s, cur, index+1);
        subs(s, cur+s.charAt(index), index+1);
    }

    public static void main(String[] args) {
        subs("ABCD", "", 0);
    }
}
