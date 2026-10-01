import java.util.ArrayList;
import java.util.List;

public class spiral_print_a_matrix{
    public List<Integer> spiralOrder(int[][] ar){
        int m = ar.length; 
        int n = ar[0].length; 
        List<Integer> result = new ArrayList<>();
        int srow = 0;
        int erow = m-1;
        int scol = 0; 
        int ecol = n-1;

        while(srow<=erow && scol<=ecol){
            //row wise left to right -> starting row print karni hai from scol to ecol
            for(int col = scol; col<=ecol; col++){
                result.add(ar[srow][col]);
            }
            srow++;
            //col wise top to bottom -> ecol print karna hai from srow to erow
            for(int row = srow; row<=erow; row++){
                result.add(ar[row][ecol]);
            }
            ecol--;
            //row wise right to left -> ending row print karni hai from ecol to scol 
            for(int col = ecol; col>=scol; col--){
                result.add(ar[erow][col]);
            }
            erow--;
            //col wise bottom to top -> scol print karna hai from erow to srow 
            for(int row = erow; row>=srow; row--){
                result.add(ar[row][scol]);
            }
            scol++;
        }
        return result;
    }
}