package problem4;

import java.util.Scanner;

/**
 * To input of range search of palindrome by user
 */
public class UserInterface {

    public UserInterface() {
    }

    /**
     * To input data by user
     * @return Object containing max and min values between that doing a search
     */
    public Data setUserInput() {
        Data data = new Data();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input max number for search palindrome");
        data.setMaxNum(scanner.nextInt());
        System.out.println("Input min number for search");
        data.setMinNum(scanner.nextInt());
        return data;
    }
}
