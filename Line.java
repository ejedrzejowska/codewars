package codewars;

public class Line {
    public static String Tickets(int[] peopleInLine)
    {
        int flag25 = 0;
        int flag50 = 0;

        for(int i = 0; i < peopleInLine.length; i++){
            int index = peopleInLine[i];
            if(index == 25)
                flag25++;
            else if(index == 50) {
                flag25--;
                flag50++;
                if(flag25 < 0) return "NO";
            }
            else if(index == 100) {
                if(flag50 > 0){
                    flag50--;
                    flag25--;
                    if(flag25 < 0) return "NO";
                } else {
                    flag25 -= 3;
                    if (flag25 < 0) return "NO";
                }
            }
        }
        if(flag25 >= 0)
            return "YES";
        else return "NO";
    }
}
