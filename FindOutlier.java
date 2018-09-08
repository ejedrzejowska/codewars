package codewars;

public class FindOutlier{
    static int find(int[] integers){
        int i = 0;
        int even = 0;
        int odd = 0;
        int evenCount = 0;
        while((even == 0 || odd == 0) && i < integers.length){
            if(integers[i] % 2 == 0){
                evenCount++;
                even = i;
            } else {
                odd = i;
            }
            i++;
        }
        return evenCount > 1 ? integers[odd] : integers[even];
    }}
