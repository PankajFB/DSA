import Arrays.SetZeros;

public class Main {
    public static void main(String[] args) {

        int[][] twoDArray = {
                {1, 2, 3},
                {4, 0, 6},
                {7, 8, 9}
        };

        SetZeros.setZeroes(twoDArray);

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

}