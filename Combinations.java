package sprint;
import java.util.ArrayList;

public class Combinations {
    public ArrayList<String> combN(int num) {

        ArrayList <String> intResult = new ArrayList<String>();
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                for (int k = j+1; k < 10; k++) {
                     String result = String.format("%d%d%d, ",i, j, k);
                     intResult.add(result);
                }
            }
        }
        return intResult;
    }
}
