package sprint;
import java.util.ArrayList;

public class Combinations {
    public ArrayList<String> combN(int n) {

        ArrayList<String> result = new ArrayList<>();   //Arraylist for result storing

        if (n <= 0) {  
            return result;
        }

        generateCombinations(n, 0, "", result); // recursive helper method

        return result;

        
            }
            private void generateCombinations(int n, int start, String current, ArrayList<String> result) {

                if (current.length() == n) {
                    result.add(current);
                    return;
        }

        for(int i = start; i <=9; i++) {    // "0", "01", after "012" recursive call ends and method backtracks to the previous call "01", "013"
            generateCombinations(n, i + 1, current + i, result);
        }

    }
}
