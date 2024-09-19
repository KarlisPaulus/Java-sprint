package sprint;

public class PrimeChecker {
    public static boolean isPrime(int number) {
        boolean result = true;
        
        for (int i = 2; i < (int)Math.sqrt(number); i++) {

            if (number%i == 0) {
                result = false;
            }
        }
        return result;
    }
}