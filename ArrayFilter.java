package sprint;
import java.util.ArrayList;

public class ArrayFilter {
    public int [][] filterBySum(int[][] array, int limit ) {
        int sum = 0;
        ArrayList<int[]> selectedRows = new ArrayList<>();  // list to store rows whose sum is lower than limit
        
        for (int i = 0; i < array.length; i++) {    // to loop through each row
            sum = 0;
            for (int j = 0; j < array[i].length; j++) {  // to calculate the sum of current row
                sum += array[i][j]; // "j" is for column
                
            }
            if (sum > limit) {  // if sum is bigger than limit
                selectedRows.add(array[i]); // add current array to selectedRows list
            }
            }
            int [][] result = new int[selectedRows.size()][];   //selectedRows list converting to 2D array.
            for (int i = 0; i < selectedRows.size(); i++) { // selectedRows size tells how many rows will be in 2D array
                result[i] = selectedRows.get(i);    // result at place i = ArrayList at place i
            }
        return result;
    }
}
