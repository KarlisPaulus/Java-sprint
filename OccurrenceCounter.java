package sprint;

public class OccurrenceCounter {
    public int countOccurrences (int[] arr, int element, int index) {
        
        if (arr == null) {
            return 0;
        }
        if (index < 0) {
            return 0;
        }
        return countOccurrencesHelper(arr, element, index);
    }
    private int countOccurrencesHelper (int[] arr, int element, int index) {
        if (index >= arr.length) {
            return 0;
        }
        int result;
        if (arr[index] == element) {    // checking match
            result = 1;
        } else {
            result = 0;
        }
        return result + countOccurrencesHelper(arr, element, index + 1);    // adds to result
    }
}
