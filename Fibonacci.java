package sprint;

public class Fibonacci {
    public int calculateFibonacci(int n) {
        if (n < 0) {
            return -1;
        }
        if (n <= 1){
            return n;
        }
        return calculateFibonacci(n-1) + calculateFibonacci(n-2);
        /* f(6) = f(5)+ f(4)
            f(5) = f(4) + f(3)
            f(4) = f(3) + f(2)
            f(3) = f(2) + f(1)
            f(2) = ......
        */
    }
}
