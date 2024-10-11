package sprint;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class WordLengthAnalyzer {
    public Map<Integer, Integer> analyzeWordLengths (List<String> words) {  // map is for storing the key that have values
        return words.stream()
            .collect(Collectors.groupingBy(str->str.length(), Collectors.collectingAndThen(Collectors.counting(), longValue -> longValue.intValue())));  // counting returns Long value, need to import it to int using lambda
            
    }
}
