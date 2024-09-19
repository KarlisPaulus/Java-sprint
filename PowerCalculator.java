package sprint;

public class PowerCalculator {
    public int calculatePower(int base, int exponent) { // 2, 3
        int sum = 0;
        int times = 0;
        if (exponent == 0) {
            exponent = 1;
        } /*else if (exponent < 0) {
            Math.pow(base, exponent);
        }*/
for (int i = 1; times <= exponent; i *= base) {
        sum = i;
        times += 1;
}
        return sum;
    }
}
