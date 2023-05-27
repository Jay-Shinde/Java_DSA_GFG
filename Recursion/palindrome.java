public class palindrome {
    static boolean ispalindrome(String s, int start, int end){
        if(start>=end)return true;
        return (s.charAt(start)==s.charAt(end) && ispalindrome(s, start+1, end-1));
    }
    public static void main(String[] args) {
        System.out.println(ispalindrome("abba", 0, 3));
    }
}
