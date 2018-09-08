package codewars;

import java.util.HashMap;

public class JomoPipi {
    public static String numericals(String s) {
        HashMap<Character, Integer> myMap = new HashMap<Character, Integer>();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (myMap.containsKey(temp)) {
                int count = myMap.get(temp) + 1;
                myMap.put(temp, count);
                str.append(count);
            } else {
                myMap.put(temp, 1);
                str.append(1);
            }
        }
        return str.toString();
    }
}
