/**
 * project Euler problem 3
 *
 * @author AlexandrAnatoliev
 * @version 0.3.0 2025-04-29
 */
public class Solution {
    public static void main(String[] args) {
    	
    	long num = Long.parseLong(args[0]);

        Calculator calculator = new Calculator();
        long answ = calculator.getMaxPrimeDiv(num);

        System.out.println("Answer is " + answ);
    }
}
