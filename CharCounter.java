package sprint;

public class CharCounter {
    public int countOccurrences(String input, char target) {
        int timesTarget = 0;
        int sum = 0;
        char targetChar = Character.toLowerCase(target);    // convert string and char dif because char is primitive type
        String strInput = input.toLowerCase();  // string is non-static?
        

        for (int i = 0; i < strInput.length(); i++) {   // using same logic as DigitSum
            char inputSplitter = strInput.charAt(i);

            if (inputSplitter == targetChar) {
                sum += 1;
            } else {
                continue;
            }

        }
        return sum;
    }
}
