package sprint;

public class GCDRecursive {
    public static int gcd (int num1, int num2) {
        if (num2 < 0) {
        num2 = num2 * -1;
        }
        if (num1 < 0) {
            num1 = num1* -1;
        }

        if (num2 == 0) {
            return num1;
        } 
       
        return gcd(num2, num1 % num2);
    }
}
