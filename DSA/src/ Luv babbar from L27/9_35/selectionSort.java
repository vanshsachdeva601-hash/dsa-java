public class selectionSort{
    public static void selectionsort(int[] ar){
        int n = ar.length; 
        int min = -1;
        for(int i = 0; i<n-1; i++){
            min = i; 
            for(int j = i+1; j<n; j++){
                if(ar[j]<ar[min]){
                    min = j;
                }
            }
            int temp = ar[i];
            ar[i] = ar[min];
            ar[min] = temp;
        }
    }
    public static void main(String[] args) {
        int[] ar = {1,5,4,2,3};
        selectionsort(ar);
        for(int e: ar){
            System.out.print(e+" ");
        }
    }
}