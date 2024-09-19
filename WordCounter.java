package sprint;

public class WordCounter {
    public int countWords(String sentence) {    // Hello World!
        
        //sentence.toCharArray();
            int wordCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (!Character.isLetter(sentence.charAt(i))) {
                if (Character.isSpaceChar(i)) {
                    break;
                } else {
                wordCount += 1;
                }
            } 
            
                /*for (int n = i; Character.isLetter(sentence.charAt(i)); i++) {
                    break;
                }
                wordCount += 1;*/
            //else if  (Character.isWhitespace(i))
            
            
        }
        return wordCount;
    }
}
