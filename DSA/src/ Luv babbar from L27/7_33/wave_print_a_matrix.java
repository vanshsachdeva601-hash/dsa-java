public class wave_print_a_matrix {
    public static void main(String[] args){
        int[][] ar = {{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
        int row = ar.length;
        int col = ar[0].length;
        for(int i = 0; i<row; i++){
            if (i%2==0){
                for(int j = 0;j<col; j++){
                    System.out.print(ar[j][i]);
                }
            }
            else{
                for(int j = col-1; j>=0; j--){
                    System.out.print(ar[j][i]);
                }
            }
            System.out.println();
        }
    }
}
