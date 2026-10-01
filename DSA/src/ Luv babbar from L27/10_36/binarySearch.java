public class binarySearch {
    public static int bs(int[] ar, int target){
        int n = ar.length; 
        int s = 0; 
        int e = n-1; 
        while(s<=e){
            int mid = s+(e-s)/2;
            if(ar[mid]==target){
                return mid;
            }
            else if(ar[mid]<target){
                s = mid+1;
            }
            else if(ar[mid]>target){
                e = mid-1;
            }
        }
        return -1;
    }

   public static void main(String[] args) {
    int[] ar = {1,2,3,4,5};
    int t = 2;
    int index = bs(ar,t);
    System.out.println(index);
   } 
}
