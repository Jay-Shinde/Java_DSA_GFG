//element that has the frequency greater than n/2

public class majorityElement {
    static int majorityElementfun(int a[], int n) {
        // your code here
        int cand = a[0];
        int life = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == cand)
                life++;
            else if (life == 0) {
                cand = a[i];
                life++;
            } else
                life--;
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == cand)
                count++;
        }
        if (count > n / 2)
            return cand;
        else
            return -1;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 4, 5, 3, 2, 3, 2, 3, 2, 2, 2, 2, 2, 2 };
        System.out.println(majorityElementfun(a, a.length));
    }
}