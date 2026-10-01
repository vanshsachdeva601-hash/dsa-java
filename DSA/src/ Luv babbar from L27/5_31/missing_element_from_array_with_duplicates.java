import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
public class missing_element_from_array_with_duplicates {
    public static List<Integer> findDisappearedNumber(int[] ar){
        List<Integer> ans = new ArrayList<>();
        int n = ar.length;
        for(int i= 0; i<n; i++){
            int value = Math.abs(ar[i]);
            int position = value - 1;
            if(position>0){
                ar[position]=  -ar[position];
            }
        }
        for(int i = 0; i<n; i++){
            if(ar[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
