package codewars;

public class Kata {
    public static void main(String[] args) {
        int[] number = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(createPhoneNumber(number));
    }
    public static String createPhoneNumber(int[] numbers) {
//        using StringBuilder
//        return new StringBuilder().append("(").append(numbers[0]).append(numbers[1]).append(numbers[2]).append(")").toString();

        return "(" + numbers[0] + numbers[1] + numbers[2] + ") "
                + numbers[3] + numbers[4] + numbers[5] + "-"
                + numbers[6] + numbers[7] + numbers[8] + numbers[9];
    }
}
