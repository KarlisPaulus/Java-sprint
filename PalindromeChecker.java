package sprint;

public class PalindromeChecker {
    public static boolean isPalindrome (String input) {
        // making the string clean
       String cleanWord = input.replaceAll("[^A-Za-z]", "").toLowerCase(); // ^ for beggining of string. if matches any of the character except A-Za-z
       
       String reverseWord = new StringBuilder(cleanWord).reverse().toString();  // reverses cleanWord

       return cleanWord.equals(reverseWord);
       
    }
}
