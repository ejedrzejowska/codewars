package codewars;

import java.util.*;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int count = 0;
        if(arr.size() == 0){
            return 0;
        } else {
            for(String s : arr) {
                if(s.charAt(0) == ':' || s.charAt(0) == ';')
                    if(s.charAt(s.length()-1) == ')' || s.charAt(s.length()-1) == 'D')
                        if(s.length() == 2 || (s.length() == 3 && (s.charAt(1) == '-' || s.charAt(1) == '~')))
                            count++;
            }
        }
        return count;
    }
}
