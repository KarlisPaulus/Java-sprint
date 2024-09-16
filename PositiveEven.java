package sprint;

public class PositiveEven {
    public boolean isPositiveAndEven(int n) {
        if (n > 0) {
            if (n % 2 == 0) {
                return true;
            } else {
                return false;
            }
            } else {
                return false;
        } 
    }
}