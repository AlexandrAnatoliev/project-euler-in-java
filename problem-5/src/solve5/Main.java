package solve5;

/**
 * project Euler problem 5
 *
 * @author AlexandrAnatoliev
 * @version 0.3.2 2025-01-08
 */
public class Main {
    public static void main(String[] args) {
        long answ = 1;

        UserInterface userInterface = new UserInterface();
        Data data = userInterface.setUserInput();

        LeastCommonMultiple lcm = new LeastCommonMultiple();
        for (long i = data.getFirstNum(); i < data.getPastNum(); i++) {
            answ = lcm.get(answ, i);
        }
        System.out.println(answ);
    }
}
