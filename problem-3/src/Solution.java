/**
 * project Euler problem 3
 *
 * @author AlexandrAnatoliev
 * @version 0.4.1 2025-04-29
 */
public class Solution {
    public static void main(String[] args) {
    	long num = (args.length > 0) ? (Long.parseLong(args[0])) : (600851475143L);

        Calculator calculator = new Calculator();
        long answ = calculator.getMaxPrimeDiv(num);

        System.out.println("Answer is " + answ);
    }
}
