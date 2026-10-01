import java.util.ArrayList;
import java.util.List;
public class sum_of_columns_of_2d_array {
    public List<Integer> columnSum(int[][] ar){
        List<Integer> result = new ArrayList<>();
        int m = ar.length;
        int n = ar[0].length;
        for(int i = 0; i<m; i++){
            int sum = 0;
            for(int j = 0;j<n; j++){
                sum+=ar[j][i];
            }
            result.add(sum);
        }
        return result;
    }
}
