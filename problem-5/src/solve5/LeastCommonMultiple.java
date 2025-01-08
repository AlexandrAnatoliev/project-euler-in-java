package solve5;

public class LeastCommonMultiple implements Function {
    @Override
    public long get(long num1, long num2) {
        return (num1 * num2) / new GreatestCommonDivisor().get(num1, num2);
    }
}
