import java.util.ArrayList;
import java.util.Scanner;
public class two_sum {
    public static int[] twoSum(int[] ar, int target){
        int n = ar.length;
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                if(ar[i]+ar[j]==target){
                    int[] ans = {i,j};
                    return ans;
                }
            }
        }
        int[] ans = {};
        return ans;
    }

    public static void main(String[] args) {
        int target = 10;
        int[] ar = {1,2,3,4,5,6,7,8,9};
        int[] ans =twoSum(ar,target);
        for(int e: ans){
            System.out.println(e);
        }
    }
}
