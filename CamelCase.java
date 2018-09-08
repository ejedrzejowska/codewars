package codewars;

public class CamelCase {

    public static String camelCase(String str) {
        String output = "";
        if(str.equals("")) return "";
        String[] text = str.trim().split(" ");
        for(int i = 0; i < text.length; i++){
            if(text[i].isEmpty()){continue;}
            String newelement = text[i].substring(0,1).toUpperCase() + text[i].substring(1);
            output += newelement;
        }
        return output;
    }

}
