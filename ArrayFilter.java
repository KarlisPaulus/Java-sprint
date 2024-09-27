package sprint;
import java.util.ArrayList;

public class ArrayFilter {
    public int [][] filterBySum(int[][] array, int limit ) {
        int sum = 0;
        ArrayList<int[]> selectedRows = new ArrayList<>();
        
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                
            }
            if (sum > limit) {
                selectedRows.add(array[i]);
            }
            }
            int [][] result = new int[selectedRows.size()][];
            for (int i = 0; i < selectedRows.size(); i++) {
                result[i] = selectedRows.get(i);
            }
        return result;
    }
}
