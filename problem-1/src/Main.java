/**
 * project Euler problem 1
 *
 * @author AlexandrAnatoliev
 * @version 0.1.0
 */
public class Main {
    public static void main(String[] args) {

        int answer = 0;

        for (int num = 1; num < 1000; num++) {
            if (isMultiples(num))
                answer += num;
        }

        System.out.println("Answer = " + answer);
    }

    static boolean isMultiples(int num) {
        return (num % 3) == 0 || (num % 5) == 0;
    }
}

