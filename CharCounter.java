package sprint;

public class CharCounter {
    public int countOccurrences(String input, char target) {
        int timesTarget = 0;
        int sum = 0;
        char targetChar = target;
        

        for (int i = 0; i < input.length(); i++) {
            char inputSplitter = input.charAt(i);

            if (inputSplitter == targetChar) {
                sum += 1;
            } else {
                continue;
            }

        }
        return sum;
    }
}
