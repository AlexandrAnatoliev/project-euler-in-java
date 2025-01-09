package solve5;

import java.util.InputMismatchException;

/**
 * project Euler problem 5
 *
 * @author AlexandrAnatoliev
 * @version 0.4.1 2025-01-08
 */
public class Main {
    public static void main(String[] args) {

        Data data;
        UserInterface userInterface = new UserInterface();

        try {
            data = userInterface.setUserInput();
        } catch (InputMismatchException exception) {
            System.out.println("Use natural numbers only!");
            data = userInterface.setUserInput();
        }

        Answer answer = new Answer();
        long answ;
        try {
            answ = answer.get(data.getFirstNum(), data.getPastNum());
        } catch (IllegalArgumentException e) {
            System.out.println("Use positive number only!");
            data = userInterface.setUserInput();
            answ = answer.get(data.getFirstNum(), data.getPastNum());
        }

        System.out.println(answ + " is the smallest number that can be divided by each of the numbers from " +
                data.getFirstNum() + " to " + data.getPastNum() + " without any remainder.");
    }

}

