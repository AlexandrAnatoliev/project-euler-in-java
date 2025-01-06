/**
 * project Euler problem 3
 *
 * @author AlexandrAnatoliev
 * @version 0.3.2 2025-01-06
 */

public class Problem4 {
    public static void main(String[] args) {

        UserInterface userInterface = new UserInterface();

        Data data = userInterface.setUserInput();
        int answer = 0;
        int fact1 = (int) Math.sqrt(data.getMaxNum());

        while (answer < fact1 * fact1) {
            for (int fact2 = fact1; fact1 * fact2 > data.getMinNum(); fact2--) {
                if (isPalindrome(String.valueOf(fact1 * fact2))) {
                    answer = Math.max(fact2 * fact1, answer);
                    break;
                }
            }
            fact1--;
        }
        System.out.println("The largest palindrome between " + data.getMinNum() + " and " + data.getMaxNum() + " is " + answer);
    }

    public static String reverse(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    public static boolean isPalindrome(String string) {
        return string.equals(reverse(string));
    }
}
