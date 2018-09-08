package codewars;

public class PangramChecker {
    public boolean check(String sentence){
        int length = sentence.length();
        sentence = sentence.toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++){
            sentence = sentence.replace(String.valueOf(letter), "");
            if(sentence.length() < length){
                length = sentence.length();
            } else {
                return false;
            }
        }
        return true;
    }
}
