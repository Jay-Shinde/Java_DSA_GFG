import java.util.ArrayList;
//The cost of stock on each day is given in an array A[] of size N. Find all the segments of days on which you buy and sell the stock so that in between those days for which profit can be generated.
//Note: Since there can be multiple solutions, the driver code will print 1 if your answer is correct, otherwise, it will return 0. In case there's no profit the driver code will print the string "No Profit" for a correct solution.
public class StokBuySell {
    static ArrayList<ArrayList<Integer> > stockBuySell(int price[], int n) {
    ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       int i=0;
       while(i<n-1)
       {
           //finding local minima or buying price
           while(i<n-1 && price[i+1]<=price[i])
           {
               i++;
           }
           if(i==n-1)
           {
               break;
           }
           ArrayList<Integer> temp=new ArrayList<>();
           temp.add(i++);//buying price
           //finding local maxima or selling price
           while(i<n-1 && price[i+1]>=price[i])
           {
               i++;
           }
          temp.add(i++);
          ans.add(temp);
       }
       return ans;
    }
    public static void main(String[] args) {
        int A[] = {100,180,260,310,40,535,695};
        int n=7;
        System.out.println(stockBuySell(A, n));
    }
}
