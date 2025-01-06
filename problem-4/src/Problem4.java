/**
 * project Euler problem 3
 *
 * @author AlexandrAnatoliev
 * @version 0.1.0 2025-01-06
 */

public class Problem4 {
    public static void main(String[] args) {

        int answer = 0;
        int num = 999;

        while (answer < num * num && num > 99) {
            for (int i = num; i > 99; i--) {
                if (isPalindrome(String.valueOf(num * i))) {
                    answer = Math.max(i * num, answer);
                    break;
                }
            }
            num--;
        }
        System.out.println(answer);
    }

    public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static boolean isPalindrome(String string) {
        return string.equals(reverse(string));
    }


}
