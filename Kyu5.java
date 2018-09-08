package codewars;

import java.awt.*;
import java.util.*;

public class Kyu5 {
    public static void main(String[] args) {
        // System.out.println(orderWeight("103 123 4444 99 2000"));
        Point[] points = new Point[]{new Point( 1,  2), new Point( 4, -1), new Point( 3,  3),
                new Point( 4, -1), new Point( 4,  1), new Point( 1,  1),
                new Point( 4, -1), new Point( 4, -1), new Point( 3,  3),
                new Point( 1,  2)};
        System.out.println(countRectTriang(points));

    }

    public static int countRectTriang(final Point[] points)
    {
        Set<Point> lista = new HashSet<>(Arrays.asList(points));
        Point[] coordinates = lista.toArray(new Point[lista.size()]);
        int count = 0;
        for(int i = 0; i < coordinates.length - 2; i++){
            for(int j = 1 + i; j < coordinates.length - 1; j++){
                for(int k = j + 1; k < coordinates.length; k++){
                    int a = getSqDistance(coordinates[i], coordinates[j]);
                    int b = getSqDistance(coordinates[j], coordinates[k]);
                    int c = getSqDistance(coordinates[k], coordinates[i]);
                    if((a + b == c) || (b + c == a) || (a + c == b)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static int getSqDistance(Point p1, Point p2){
        int squareDist = 0;
        squareDist =(int) ((p1.getX()-p2.getX()) * (p1.getX()-p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
        return squareDist;
    }

    public static String orderWeight(String str) {
        String temp = str;
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