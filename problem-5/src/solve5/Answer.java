package solve5;

public class Answer implements Function {

    public Answer() {
    }

    @Override
    public long get(long num1, long num2) {
        long aswer = 1;
        LeastCommonMultiple lcm = new LeastCommonMultiple();

        for (long i = num1; i <= num2; i++) {
            aswer = lcm.get(aswer, i);
        }
        return aswer;
    }
}
