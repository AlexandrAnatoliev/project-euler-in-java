import java.util.Scanner;

/**
 * project Euler problem 2
 *
 * @author AlexandrAnatoliev
 * @version 0.1.2 2025-04-24
 */
public class Solution {
  public static void main(String[] args) {

    int firstFib = 1;
    int secondFib = 2;
    int nextFib = 3; // 1 + 2
    int answer = 0;

    Scanner input = new Scanner(System.in);
    System.out.print("Input max value Fibonacci sequence term: ");
    int max = input.nextInt();

    while (nextFib < max) {

      if (secondFib % 2 == 0) {
        answer += secondFib;
      }

      nextFib = firstFib + secondFib;
      firstFib = secondFib;
      secondFib = nextFib;
    }

    System.out.println("Answer is " + answer);
    input.close();
  }
}
