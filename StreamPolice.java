package sprint;

import java.util.List;
import java.util.stream.Collectors;

public class StreamPolice {
    public List<Integer> processNumbers (List<Integer> numbers) {
        List<Integer> result = numbers.parallelStream()
        .filter(n -> n >= 0)
        
        .collect(Collectors.toList());

        result.removeIf(n -> n % 5 == 0 && n % 10 != 0);
        
        return result;
    }
}
