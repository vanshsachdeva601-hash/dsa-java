//

public class lowerbound {
    public static int getLowerBound(int[] ar, int target){
        int n = ar.length; 
        int s = 0; 
        int e = n-1;
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(ar[mid]>=target){
                //store answer
                ans = mid;
                //left move
                e = mid-1;
            }
            else if(ar[mid]<target){
                //right move
                s = mid+1;
            }
        }
        return ans; 
    }
    public static void main(String[] args) {
        int[] ar = {10,20,30,30,30,40,50};
        int lb = getLowerBound(ar, 30);
        System.out.println("Lower bound index: "+lb);
    }

}
