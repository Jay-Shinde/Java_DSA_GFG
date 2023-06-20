public class MergetwosortedArrays {
    static void fun(int a1[], int a2[]){
        int i=0, j=0, k=0;
        int[] arr = new int[a1.length+a2.length];
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]){
                arr[k++]=a1[i++];
            }
            
            else arr[k++]=a2[j++];
        }
        while(i<a1.length){
            arr[k++]=a1[i++];
        }
        while(j<a2.length){
            arr[k++]=a2[j++];
        }
        for(int l=0; i<k; l++){
            System.out.print(arr[l]);
        }
    }
    public static void main(String[] args) {
        int[] a1={1,3,4,6};
        int[] a2={2,5,7,8};
        fun(a1, a2);
    }
}
