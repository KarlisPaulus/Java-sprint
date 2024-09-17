package sprint;

public class BasicCalc {
    public int doOperation(int a, char op, int b) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '/') {
            if (b != 0) {
                return a / b;
            } else {
                return 0;
            }
        } else if (op == '*') {
            return a * b;
        } else if (op == '%') {
            if (b != 0) {
                return a % b;
            } else {
            return 0;
            }
        } else {
            return 0;
        }
    }
}