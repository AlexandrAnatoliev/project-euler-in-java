package solve5;

public class Main {
    public static void main(String[] args) {
        long answ = 1;
        for (int i = 2; i < 20; i++) {
            answ = getLCM(answ, i);
        }
        System.out.println(answ);
    }

    public static long getGCD(long num1, long num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }
        return Math.max(num1, num2);
    }

    public static long getLCM(long num1, long num2) {
        return (num1 * num2) / getGCD(num1, num2);
    }
}
