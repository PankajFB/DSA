public class Main {
    public static void main(String[] args) {

        int[][] twoDArray = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        setZeroes(twoDArray);

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

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