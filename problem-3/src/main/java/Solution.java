/**
 * project Euler problem 3
 *
 * @author AlexandrAnatoliev
 * @version 0.1.0 2024-12-21
 */
public class Solution {
    public static void main(String[] args) {

        long num = 600_851_475_143L;
        long minDiv = getMinDiv(num);

        while (minDiv != 1) {
            num = num / minDiv;
            minDiv = getMinDiv(num);
        }
        System.out.println("Answer is " + num);
    }

    public static long getMinDiv(long number) {
        long div = 2;

        for (div = 2; div * div < number; div++) {
            if (number % div == 0)
                return div;
        }

        return 1;
    }
}
