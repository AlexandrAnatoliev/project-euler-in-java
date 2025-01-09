package solve5;

public class GreatestCommonDivisor implements Function {
    public GreatestCommonDivisor() {
    }

    @Override
    public long get(long num1, long num2) {
        if (num1 < 0 || num2 < 0) {
            long errorNum = Math.min(num1, num2);
            throw new IllegalArgumentException(errorNum + " is negative number");
        }
        while (num1 > 0 && num2 > 0) {
            if (num1 > num2) {
                num1 %= num2;
            } else {
                num2 %= num1;
            }
        }
        return Math.max(num1, num2);
    }
}
