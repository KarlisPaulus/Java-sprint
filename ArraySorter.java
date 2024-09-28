package sprint;

public class ArraySorter {
    public double[] sortArray(double[] arr) {
        
        boolean sorted = false;
        int n = arr.length;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < n-1; i++) {
                if (arr[i]>arr[i+1]) {
                    double num = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = num;
                    sorted = false;
                }
            }   
        }
        return arr;
    }
}
