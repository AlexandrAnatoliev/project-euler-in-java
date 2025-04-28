/**
 * project Euler problem 3
 *
 * @author AlexandrAnatoliev
 * @version 0.1.1 2025-04-28
 */
public class Solution {
    public static void main(String[] args) {

        long num = 600_851_475_143L;
        Calculator calculator = new Calculator();
        long answ = calculator.getMaxPrimeDiv(num);

        System.out.println("Answer is " + answ);
    }
}
