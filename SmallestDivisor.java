package sprint;

public class SmallestDivisor {
    public int smallestDivisor(int number) {
        int divisor = 0;
        for (int i = 2; i < number; i++) {
            if (number%i == 0) {
                divisor = i;
                break;
            }
        }
        return divisor;
    }
}
