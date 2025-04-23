/**
 * project Euler problem 1
 *
 * @author AlexandrAnatoliev
 * @version 0.2.0 2024-10-19
 */
public class Solution {

  public static void main(String[] args) {

    int answer = 0;

    for (int num = 1; num < 1000; num++) {
      if ((num % 3) == 0 || (num % 5) == 0)
        answer += num;
    }

    System.out.println("Answer = " + answer);
  }

}
