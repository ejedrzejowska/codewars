package codewars;

import java.util.HashMap;

public class Solution
{
    public static int[] twoSum(int[] numbers, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < numbers.length; i++){
            myMap.put(numbers[i], i);
        }
        for(int i = 0; i < numbers.length; i++){
            int summand = target - numbers[i];
            if(myMap.containsKey(summand)){
                result[0] = i;
                result[1] = myMap.get(summand);
            }
        }
        return result;
    }
}
