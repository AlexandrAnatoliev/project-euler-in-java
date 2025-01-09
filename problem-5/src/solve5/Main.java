package solve5;

/**
 * project Euler problem 5
 *
 * @author AlexandrAnatoliev
 * @version 0.3.3 2025-01-08
 */
public class Main {
    public static void main(String[] args) {
        long answer = 1;

        UserInterface userInterface = new UserInterface();
        Data data = userInterface.setUserInput();

        LeastCommonMultiple lcm = new LeastCommonMultiple();
        for (long i = data.getFirstNum(); i < data.getPastNum(); i++) {
            answer = lcm.get(answer, i);
        }

        System.out.println(answer + " is the smallest number that can be divided by each of the numbers from " +
                data.getFirstNum() + " to " + data.getPastNum() + " without any remainder.");
    }
}
