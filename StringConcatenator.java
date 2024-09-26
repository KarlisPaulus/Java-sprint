package sprint;

public class StringConcatenator {
    public String concatenate (String... input) {   // varargs syntax in java is String...  make available to pass multiple string values to this method.
                                                    // they are collected to single String[]array
        StringBuilder result = new StringBuilder();
        for (String r : input) {
            result.append(r);   // for-each loop
        }
        return result.toString();
    }
}
