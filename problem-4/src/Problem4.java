/**
 * project Euler problem 3
 *
 * @author AlexandrAnatoliev
 * @version 0.3.1 2025-01-06
 */

public class Problem4 {
    public static void main(String[] args) {

        UserInterface userInterface = new UserInterface();

        Data data = userInterface.setUserInput();
        int answer = 0;
        int num = (int) Math.sqrt(data.getMaxNum());

        while (answer < num * num && num > data.getMinNum()) {
            for (int i = num; i > data.getMinNum(); i--) {
                if (isPalindrome(String.valueOf(num * i))) {
                    answer = Math.max(i * num, answer);
                    break;
                }
            }
            num--;
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
