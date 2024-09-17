package sprint;

public class BetweenLimits {
    private char[] range;

    public String findRange(char from, char to) {
        

        if (from > to) {
            char flip = from;
            from = to;
            to = flip;
        }
        StringBuilder result = new StringBuilder(); // stringbuilder is used to add chars to string. in golang we used string+=i but in java it doesn't work.

        for (char i = (char) (from + 1); i < to; i++) {
            result.append(i);   // lisama
        }
        
        return result.toString();   // convert StringBuilder to String.
    }
}