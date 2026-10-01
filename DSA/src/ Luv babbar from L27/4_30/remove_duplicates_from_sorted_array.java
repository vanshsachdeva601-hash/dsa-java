public class remove_duplicates_from_sorted_array {
    public static int removeDuplicates(int[] ar){
        int i = 0;
        int j = 1;
        int n = ar.length;
        while(j<n){
            if(ar[i]==ar[j]){
                j++;
            }
            else {
                i++;
                ar[i] = ar[j];
                j++;
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        int[] ar = {1,1,2,2,2,2,3,4,5,5};
        int length = removeDuplicates(ar);
        System.out.println(length);
    }
}
