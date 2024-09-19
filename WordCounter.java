package sprint;

public class WordCounter {
    public int countWords(String sentence) {    // Hello World!
        
            int wordCount = 0;
            boolean isWord = false;
        for (int i = 0; i < sentence.length(); i++) {
            //char currentchar = sentence.charAt(i) would be better
            if (Character.isLetter(sentence.charAt(i))) {   // if current char is letter
                isWord = true;  // it will be word
            }
            if (Character.isWhitespace(sentence.charAt(i)) && isWord) { // if currentchar is space and isWord is true from previous control
                    wordCount ++;   //then the word is ended
                    isWord = false; // make the isWord to false for finding the next word
                 }
            } 
            if (isWord) {   // this is for word when it will be last(without space)
                wordCount++;
            }
            return wordCount;
        }
    }
