package sprint;
import java.util.ArrayList;

public class ArrayModifier {
    public static ArrayList<Double> removeElementsBetween(ArrayList<Double> list, int index1, int index2) {
        
        if (index1 > index2) {
            int swap = index1;
            index1 = index2;
            index2 = swap;
        }

        index1 = Math.max(0, index1);   // returns bigger value
        index2 = Math.min(list.size(), index2); // returns smallest value

        for (int i = index1; i < index2; i++) {
            list.remove(index1);    // removing index1 every loop because every time removing element shifts other values to left.
        }

        return list;
    }
}

