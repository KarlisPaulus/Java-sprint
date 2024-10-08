package sprint;
import java.util.List;

public class UsernameProcessor {
    public String findFirstUsername (List<String> usernames) {
        String result = usernames.stream()
        .findFirst()
        .orElse("Anonymous");
        return result;
    }
}
