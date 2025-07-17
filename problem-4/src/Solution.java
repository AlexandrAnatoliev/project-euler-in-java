/**
 * project Euler problem 4
 *
 * @author AlexandrAnatoliev
 * @version 0.9.0 2025-07-14
 */
public class Solution {
  public static void main(String[] args) {
    int digits = (args.length > 0) ? (Integer.parseInt(args[0])) : (3);

    int max = (int) Math.pow(10, digits) - 1;
    int min = (int) Math.pow(10, digits - 1);

    int answer = 0;
    int fact1 = max;

    while (answer < fact1 * fact1) {
      for (int fact2 = fact1; fact2 > min; fact2--) {
        if (isPalindrome(fact1 * fact2)) {
          answer = Math.max(fact1 * fact2, answer);
          break;
        }
      }
      fact1--;
    }
    System.out.println("The largest palindrome between " + min +
        " and " + max + " is " + answer);
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
