import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
public class sum_of_rows_of_2D_array {
    public static List<Integer> rowSums(int[][] ar){
        List<Integer> result = new ArrayList<>();
        int m = ar.length;
        int n = ar[0].length;
        for(int i = 0; i<m; i++){
            int sum = 0;
            for(int j = 0;j<n; j++){
                int value = ar[i][j];
                sum+=value;
            }
            result.add(sum);
        }
        return result;
    }
}
