package sprint;

public class NumberComparator {
    public String wichIsGreater(int n, double f) {
        if (n > f) {
            return "Integer";
        } else if (n < f) {
            return "Float";
        } else {
            return "Same";
        }
    } 
}
