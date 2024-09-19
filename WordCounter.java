package sprint;

public class WordCounter {
    public int countWords(String sentence) {    // Hello World!
        
            int wordCount = 0;
            boolean isWord = false;
        for (int i = 0; i < sentence.length(); i++) {
            //char currentchar = sentence.charAt(i)
            if (Character.isLetter(sentence.charAt(i))) {
                isWord = true;
            }
            if (Character.isWhitespace(sentence.charAt(i)) && isWord) {
                    wordCount ++;
                    isWord = false;
                 }
            } 
            if (isWord) {
                wordCount++;
            }
            return wordCount;
        }
    }
