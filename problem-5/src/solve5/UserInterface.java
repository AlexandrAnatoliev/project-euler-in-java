package solve5;

import java.util.Scanner;

/**
 * To input of range search by user
 */
public class UserInterface {

    public UserInterface() {
    }

    /**
     * To input data by user
     *
     * @return Object containing first and past values between that doing a search
     */
    public Data setUserInput() {
        Data data = new Data();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number for search answer");
        data.setFirstNum(scanner.nextInt());
        System.out.println("Input past number for search");
        data.setPastNum(scanner.nextInt());
        return data;
    }
}
