/**
 * project Euler problem 4
 *
 * @author AlexandrAnatoliev
 * @version 0.7.0 2025-06-03
 */
public class Solution {
  public static void main(String[] args) {
    int digits = (args.length > 0) ? (Integer.parseInt(args[0])) : (3);

    int limit = 999999;
    int answer = 0;
    int fact1 = (int) Math.sqrt(limit);

    while (answer < fact1 * fact1) {
      for (int fact2 = fact1; fact1 * fact2 > 99999; fact2--) {
        if (isPalindrome(fact1 * fact2)) {
          answer = Math.max(fact1 * fact2, answer);
          break;
        }
      }
      fact1--;
    }
    System.out.println("The largest palindrome between " + 99999 +
        " and " + 999999 + " is " + answer);
  }

  /**
   * Метод возвращающий максимальное число, которое можно получить умножением 2-х
   * digits-значных чисел
   * @param digits количество чисел во множителях
   * @return максимальное число
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
