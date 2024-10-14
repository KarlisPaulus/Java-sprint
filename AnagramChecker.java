package sprint;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams (String input1, String input2) {
        String word1 = input1.replaceAll("[^A-Za-z]", "").toLowerCase();
        String word2 = input2.replaceAll("[^A-Za-z]", "").toLowerCase();
        

        char[] sortWord1 = word1.toCharArray();
        char[] sortWord2 = word2.toCharArray();
        
        Arrays.sort(sortWord1);
        Arrays.sort(sortWord2);
        


        return Arrays.equals(sortWord1, sortWord2); // compares the actual elements inside the arrays
        // return sortWord1.equals(sortWord2); - equal to "==". used to check if they are the same array object in memory.
    }
}
