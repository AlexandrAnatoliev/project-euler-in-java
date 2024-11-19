/**
 * project Euler problem 1
 *
 * @author AlexandrAnatoliev
 * @version 0.1.1 2024-10-19
 */
public class Problem1 {
    public static void main(String[] args) {

        int answer = 0;

        for (int num = 1; num < 1000; num++) {
            if (isMultiples(num))
                answer += num;
        }

        System.out.println("Answer = " + answer);
    }

    private static boolean isMultiples(int number) {
        return (number % 3) == 0 || (number % 5) == 0;
    }
}

