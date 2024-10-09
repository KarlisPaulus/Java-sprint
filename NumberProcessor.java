package sprint;

import java.util.Optional;
import java.util.List;

public class NumberProcessor {
    public Optional<Integer> processNumbers (List<Integer> numbers) {
        return numbers.stream()
            .filter(n -> n >= 10)
            .reduce((a, b) -> a * b);
    }
}
