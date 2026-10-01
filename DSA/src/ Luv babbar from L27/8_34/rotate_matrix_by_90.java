public class rotate_matrix_by_90{
    public void rotate90Clockwise(int[][] ar, int N){
        //step1: transpose of a matrix in place
        int row = ar.length; 
        int col = ar[0].length; 
        for(int i = 0; i<row; i++){
            for(int j = i+1;j<col; j++){
                int temp = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = temp;
            }
        }
        //step2: reverse all rows of matrix     
        for(int i = 0; i<row; i++){
            int startCol = 0; 
            int endCol = col-1;
            while(startCol<=endCol){
                int temp = ar[i][startCol];
                ar[i][startCol] = ar[i][endCol];
                ar[i][endCol] = temp;
                startCol++;
                endCol--;
            }
        }
    }
}