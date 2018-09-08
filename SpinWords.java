package codewars;

public class SpinWords {

    public String spinWords(String sentence) {
        String[] split = sentence.split(" ");
        String finalString = "";
        for (int i = 0; i < split.length; i++) {
            if (split[i].length() >= 5) {
                char[] table = split[i].toCharArray();
                String reversed = "";
                for (int j = (table.length - 1); j >= 0; j--) {
                    reversed += table[j];
                }
                finalString += reversed + " ";
            } else {
                finalString += split[i] + " ";
            }
        }
        return finalString.trim();
    }
}
