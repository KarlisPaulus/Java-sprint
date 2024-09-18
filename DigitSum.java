package sprint;

public class DigitSum {
    public static int sumOfDigits(int number) {
        int result = 0;

        String strNumbers = String.valueOf(number); // "1234"
        char charNumber = strNumbers.charAt(0);
        if (charNumber == '-') {
            result = 1;
        } else {
            result = 0;
        }

        for (int i = 0; i < strNumbers.length(); i++) {     // loops until length of input. "<"" need to be because we start cunting from 0.
            char currentChar = strNumbers.charAt(i); // gets current character in ascii value of string
            int numericValue = Character.getNumericValue(currentChar);  // need to convert the ascii value to numeric
            result += numericValue; // add to the result. in my case 1+2+3+4=10

        }
        return result;
    }
    
}
    
