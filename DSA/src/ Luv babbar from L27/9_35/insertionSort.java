public class insertionSort {
    public static void insertionsort(int[] ar){
        int n = ar.length; 
        for(int i = 1; i<n; i++){
            int curr = i; 
            int currval = ar[i];
            int prev = i-1;
            while(prev>=0 && currval<ar[prev]){
                ar[prev+1] = ar[prev];
                prev--;
            }
            ar[prev+1] = currval;
        }
    }
    public static void main(String[] args) {
        int[] ar = {1,5,2,3,4};
        insertionsort(ar);
        for(int e: ar){
            System.out.print(e+" ");
        }
    }
}
