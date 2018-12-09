package codewars;

import java.util.ArrayList;

public class PersistentBugger {
    class Persist {
        public static int persistence(long n) {
            int i = 0;
            while (n >= 10) {
                ArrayList<Integer> arrayList = toArray(n);
                n = multiplyContent(arrayList);
                System.out.println(n);
                i++;
            }
            return i;
        }

        public static ArrayList<Integer> toArray(long n) {
            ArrayList<Integer> arr = new ArrayList<>();
            do {
                arr.add((int) (n % 10));
                n /= 10;
            } while (n != 0);
            return arr;
        }

        public static int multiplyContent(ArrayList<Integer> list) {
            return list.stream().reduce(1, (a, b) -> a * b);
        }
    }
}
