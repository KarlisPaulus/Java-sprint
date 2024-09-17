package sprint;

public class BetweenLimits {
    private char[] range;

    public String findRange(char from, char to) {
        

        if (from > to) {
            char flip = from;
            from = to;
            to = flip;
        }
        StringBuilder result = new StringBuilder();

        for (char i = (char) (from + 1); i < to; i++) {
            result.append(i);
        }
        
        return result.toString();
    }
}