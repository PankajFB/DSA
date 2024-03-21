package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int noOfRows = 5;
        System.out.println(generate(noOfRows));
    }

    private static List<List<Integer>> generate(int noOfRows) {
        // to store the pascal triangle
        List<List<Integer>> triangle = new ArrayList<>();

        // loop to create the pascal trianlge
        for(int i = 0; i < noOfRows; i++){

            // new row to store the elements of the current row
            List<Integer> row = new ArrayList<>();

            // add the 1 to the first element
            row.add(1);

            // populate the other elements in the row
            for (int j = 1; j < i; j++){

                // take reference to the previous row
                List<Integer> prevRow = triangle.get(i-1);

                // find the value of the current element
                int num = prevRow.get(j) + prevRow.get(j-1);

                // add it to the row
                row.add(num);



            }
            // set one at the end expect the first row
            if(i > 0){
                row.add(1);
            }

            // now add the row to the triangle
            triangle.add(row);
        }

        // return the ans
        return triangle;
    }
}
