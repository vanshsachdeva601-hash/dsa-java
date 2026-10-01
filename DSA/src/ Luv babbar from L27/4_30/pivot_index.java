public class pivot_index {
    public static int pivotIndex(int[] ar){
        int n = ar.length;
        for(int i =0; i<n; i++){
            int lsum=0;
            int rsum = 0;
            for(int j = 0; j<i; j++){
                lsum+=ar[j];
            }
            for(int k = i+1;k<n; k++){
                rsum+=ar[k];
            }
            if(lsum==rsum){
                return i;
            }
        }
        return -1;
    }
    public static int pivotIndexTeacherMethod(int[] ar){
        int n =ar.length;
        int[] lsum = new int[n];
        int[] rsum = new int[n];
        lsum[0] = ar[0];
        for(int i = 1; i<n; i++){
            lsum[i] = lsum[i-1]+ ar[i];
        }
        rsum[n-1] = ar[n-1];
        for(int i = n-2; i>=0; i--){
            rsum[i] = ar[i]+rsum[i+1];
        }
        for(int i= 0 ;i<n; i++){
            if(lsum[i]==rsum[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] ar = {1,7,3,6,5,6};
        int pi = pivotIndex(ar);
        System.out.println(pi);
        int pi2 = pivotIndexTeacherMethod(ar);
        System.out.println(pi2);
    }
}
