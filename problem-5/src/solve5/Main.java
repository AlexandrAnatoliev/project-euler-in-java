package solve5;

/**
 * project Euler problem 5
 *
 * @author AlexandrAnatoliev
 * @version 0.2.0 2025-01-08
 */
public class Main {
    public static void main(String[] args) {
        long answ = 1;

        LeastCommonMultiple lcm = new LeastCommonMultiple();
        for (long i = 2; i < 20; i++) {
            answ = lcm.get(answ, i);
        }
        System.out.println(answ);
    }

}
