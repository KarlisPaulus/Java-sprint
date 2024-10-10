package sprint;
import java.util.List;
import java.util.stream.Collectors;

public class EmailDomainExtractor {
    public List<String> extractDomains (List<String> emails) {
       List<String> result = emails.stream()
        .filter(line -> line.contains("@") && line.indexOf('@') == line.lastIndexOf('@'))   // filters out emails that contain only one "@"
        .filter(line -> line.indexOf('@') > 0 && line.indexOf('@') < line.length() - 1) // filters out emails that have smth before "@" and smth after
        .map(line -> line.split("@")[1].toLowerCase())  // split("place")[0 or 1]
        .distinct() // removes duplicates
        .collect(Collectors.toList());
        return result;
    }
}
