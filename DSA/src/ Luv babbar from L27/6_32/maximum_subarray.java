public class maximum_subarray {
    public static int maxSubArraySumBruteForce(int[] ar){
        int n = ar.length;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            int currsum = 0;
            for(int j = i; j<n; j++){
                currsum+=ar[j];
                maxsum = Math.max(currsum,maxsum);
            }
        }
        return maxsum;
    }
    public static int maxSubArrayOptimisedKadanesAlgo(int[] ar){
        int n = ar.length;
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            currsum +=ar[i];
            maxsum = Math.max(currsum,maxsum);
            if(currsum<0){
                currsum = 0;
            }
        }
        return maxsum;
    }

    static void main() {
        int[] ar = {1,2,3,4,5};
        int maxsubarraybruteforce = maxSubArraySumBruteForce(ar);
        System.out.println(maxsubarraybruteforce);
        int maxsubarrayoptimised = maxSubArrayOptimisedKadanesAlgo(ar);
        System.out.println(maxsubarrayoptimised);
    }
}
