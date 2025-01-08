package solve5;

public class GreatestCommonDivisor implements Function {
    @Override
    public long get(long num1, long num2) {
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }
        return Math.max(num1, num2);
    }
}
