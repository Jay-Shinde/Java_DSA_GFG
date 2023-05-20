//You are given a decimal number N. You need to find the gray code of the number N and convert it into decimal.
public class binaryTogray {
    static int toGray(int n){
        return (n^(n>>1));
    }
    public static void main(String[] args) {
        System.out.println(toGray(7));
    }
}
