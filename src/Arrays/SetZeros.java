package Arrays;

public class SetZeros {
    public static void setZeroes(int[][] matrix){

        if (matrix.length == 0 || matrix[0].length == 0)
            return;

        int rows = matrix.length;
        int columns = matrix[0].length;

        boolean[] zeroRows  = new boolean[rows];
        boolean[] zeroColumns =  new boolean[columns];

//        marking the zeros and columns to be set to zeros
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j]==0){
                    zeroRows[i]=true;
                    zeroColumns[j]=true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Corrected logic to set only specific elements to zero
                if (zeroRows[i] || zeroColumns[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
