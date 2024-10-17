package sprint;

public class GCDRecursive {
    public static int gcd (int num1, int num2) {
        if (num2 <= 1) {
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}
