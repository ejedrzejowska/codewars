package codewars;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class WeightSort {

    public static String orderWeight(String strng) {
        String temp = strng;
        String strout = "";
        String[] output = temp.trim().split(" ");
        Arrays.sort(output);
        Map<Integer, String> weights = new TreeMap<>();

        for(int i = 0; i < output.length; i++){
            int sum = 0;
            if(output[i].isEmpty()){
                continue;
            }
            for(int j = 0; j < output[i].length(); j++){
                sum += Integer.parseInt("" + output[i].charAt(j));
            }
            if(weights.containsKey(sum)){
                weights.put(sum, weights.get(sum) + " " + output[i]);
            } else {
                weights.put(sum, output[i]);
            }

        }
        for(Map.Entry<Integer,String> entry : weights.entrySet()){
            strout += " " + entry.getValue();
        }

        return strout.trim();
    }
}
