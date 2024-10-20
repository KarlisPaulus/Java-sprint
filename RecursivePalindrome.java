package sprint;

public class RecursivePalindrome {
    public boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        String cleanStr = str.replaceAll("[^A-Za-z^]", "").toLowerCase();   // replaces all what excludes the alphabet

        return isPalindromeHelper(cleanStr, 0, cleanStr.length()-1);    // calls helper for checking
    }
    private boolean isPalindromeHelper(String str, int start, int end) {

        if (start >= end) { // base case
            return true;    // if "loop" iterates over every char then true
        }
        if (str.charAt(start) == str.charAt(end)) {     // if first char equals last then iterates to next char
            return isPalindromeHelper(str, start + 1, end - 1);
        }
        return false; // if comparing doesn't == then falls down to here
    }
}
