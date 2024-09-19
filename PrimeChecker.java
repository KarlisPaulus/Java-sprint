package sprint;

public class PrimeChecker {
    public static boolean isPrime(int number) {
        boolean result = true;
        if (number <= 2) {  //handles definetly not prime numbers
            return false;
        }
        for (int i = 2; i < (int)Math.sqrt(number); i++) {  // loops until square root of input number

            if (number%i == 0) {    // if remainder of number is 0, it means that it is not prime number
                result = false;
            }
        }
        return result;
    }
}