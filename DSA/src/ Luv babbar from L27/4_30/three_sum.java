public class three_sum {
    public static int[] threeSum(int[] ar, int target) {
        int n = ar.length;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (ar[i] + ar[j] + ar[k] == target) {
                        int[] ans = {i, j, k};
                        return ans;
                    }
                }
            }
        }
        int[] ans = {};
        return ans;
    }

    public static void main(String[] args) {
        int target = 10;
        int[] ar = {1,2,3,4,5,6,7,8,9};
        int[] ans = threeSum(ar,target);
        for(int e: ans){
            System.out.println(e);
        }
    }
}
