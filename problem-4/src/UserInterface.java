import java.util.Scanner;

public class UserInterface {

    public UserInterface() {
    }

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
