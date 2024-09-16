package sprint;

public class ReverseLetter {
    public char reverseLetter(char input) {
        char result = (char) (('a'+'z')-input);
        return result;
    }   
}
