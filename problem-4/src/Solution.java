/**
 * project Euler problem 4
 *
 * @author AlexandrAnatoliev
 * @version 0.7.5 2025-06-03
 */
public class Solution {
  public static void main(String[] args) {
    int digits = (args.length > 0) ? (Integer.parseInt(args[0])) : (3);

    int max = getMaxNumber(digits);
    int min = getMaxNumber(digits - 1);

    int answer = 0;
    int fact1 = (int) Math.sqrt(max);

    while (answer < fact1 * fact1) {
      for (int fact2 = fact1; fact1 * fact2 > min; fact2--) {
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
   * Method to return 9*9, 99*99 e.t.c	
   * 
   * @param digits in numbers (99 = 2, 999 = 3 ...)
   * @return max number
   */
  public static int getMaxNumber(int digits) {
    int maxNumber = 0;
    int fact = 1;
    for (int i = 0; i < digits; i++) {
      maxNumber += 9 * fact;
      fact *= 10;
    }
    return maxNumber * maxNumber;
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
