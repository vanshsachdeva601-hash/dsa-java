public class transpose_of_array {
    public int[][] transpose(int[][] ar){
        //for original array 
        int totalRows = ar.length; 
        int totalCol = ar[0].length;
        //for new array
        int newTotalRows = totalCol;
        int newTotalCol = totalRows;

        int[][] ans = new int[newTotalRows][newTotalCol];
        //traversing through old array
        for(int i = 0; i<totalRows; i++){
            for(int j = 0;j<totalCol; j++){
                ans[j][i] = ar[i][j]; 
            }
        }
        return ans;
    }
}
