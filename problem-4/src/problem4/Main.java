package problem4;
/**
 * project Euler problem 4
 *
 * @author AlexandrAnatoliev
 * @version 0.4.3 2025-01-06
 */
public class Main {
    public static void main(String[] args) {

        UserInterface userInterface = new UserInterface();
        Data data = userInterface.setUserInput();

        int answer = 0;
        int fact1 = (int) Math.sqrt(data.getMaxNum());

        while (answer < fact1 * fact1) {
            for (int fact2 = fact1; fact1 * fact2 > data.getMinNum(); fact2--) {
                if (isPalindrome(fact1 * fact2)) {
                    answer = Math.max(fact1 * fact2, answer);
                    break;
                }
            }
            fact1--;
        }
        System.out.println("The largest palindrome between " + data.getMinNum() +
                " and " + data.getMaxNum() + " is " + answer);
    }

    /**
     * Method inverts natural number
     *
     * @param number Natural number
     * @return Inverted number
     */
    public static int invert(int number) {
        String stringNumber = String.valueOf(number);
        stringNumber = new StringBuilder(stringNumber).reverse().toString();
        return Integer.parseInt(stringNumber);
    }

    /**
     * Method checks if number is palindrome
     *
     * @param number Number being checking
     * @return True, if number is palindrome
     */
    public static boolean isPalindrome(int number) {
        return number == invert(number);
    }
}
