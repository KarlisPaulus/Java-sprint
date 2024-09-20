package sprint;

public class ArrayInitializer {
    public int[] fillArray(int max) {
        int[] emptyArray = new int [0];
        if (max < 1) {
            return emptyArray;
        }
        
        int[] array = new int[max];
        for (int i = 0; i < array.length; i++) {
            array[i] += i + 1;
        }
        return array;
    }
}
