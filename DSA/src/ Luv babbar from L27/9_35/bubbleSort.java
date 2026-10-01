public class bubbleSort{
    public static void bubblesort(int[] ar){
        int n = ar.length; 
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n-1-i; j++){
                if(ar[j]>ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] ar = {1,5,2,3,4};
        bubblesort(ar);
        for(int e: ar){
            System.out.print(e+" ");
        }
    }
}