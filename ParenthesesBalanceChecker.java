package sprint;

public class ParenthesesBalanceChecker {
    public boolean isBalanced(String str) {
        if (str == null) {
            return false;
        }
        if (str == "") {
            return true;
        }

        return checkBalance(str, 0, 0);
    }
    private boolean checkBalance(String str, int index, int balance) {
        if (index == str.length()-1) {
            if (balance == 0) {
                return true;
            } else {
                return false;
            }
        }

        if (str.charAt(index) == '(') {
            balance = 1;
        } else if (str.charAt(index) == ')') {
            balance = 0;
        }
        if (str.charAt(index) == ')' && str.charAt(index + 1) == '(') {
            return false;
        }
       
        return checkBalance(str, index + 1, balance);
    }
}
