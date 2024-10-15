package sprint;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {
    public static List<Integer> findPrimesUpTo (int limit) { 

        List<Integer> result = new ArrayList<>();

        for (Integer i = 2; i <= limit; i++) {  
            result.add(i);
            for (Integer n = 2; n <= i; n++) {
            if (n == i) {
                continue;
            } 
            if (i % n == 0) {
                result.remove(i);
            }
        }
        }
        return result;
    }
}
