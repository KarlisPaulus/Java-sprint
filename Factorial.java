package sprint;

public class Factorial {
    public int calculateFactorial(int n) {
        if (n < 0) {    // when input is negative
            return 0;
        }
       if (n <= 1) {
        return 1;
       }
       // recursive call
       return n * calculateFactorial(n-1);  // this keeps calling itself until n <= 1
    }
}
