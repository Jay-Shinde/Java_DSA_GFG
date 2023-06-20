public class MaxIndex { 
    static int maxIndexDiff(int A[], int N) { 
        int[] leftMin = new int[N];
        int[] rightMax = new int[N];
        leftMin[0] = A[0];
        for (int i = 1; i < N; i++) {
            leftMin[i] = Math.min(A[i], leftMin[i-1]);
        }
        // Pre compute the maximum likewise
        rightMax[N-1] = A[N-1];
        for (int i = N - 2; i >= 0; i--) {
            rightMax[i] = Math.max(A[i], rightMax[i+1]);
        }
        
        int maxDiff = 0;
        int i = 0;
        int j = 0;
        while (i < N && j < N) {
            if (leftMin[i] <= rightMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }
        return maxDiff;
    }
    public static void main(String[] args) {
                int[] array = {1,2,3,4,5,6,5,4,6,7};
                System.out.print(maxIndexDiff(array, array.length));
    }
}
