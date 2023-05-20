public class PrindPowerSet {
    static void printPowerSet(char []set, int n){
        int x=1<<n;
        for(int i=0; i<x; i++){
            for(int j=0; j<n; j++){
                if((i&(1<<j))!=0){
                    System.out.print(set[j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char []set = {'a', 'b', 'c'};
		printPowerSet(set, 3);
    }
}
