/**
 * 
 * This class performs calculations
 */
public class Calculator {

    public long getMinDiv(long number) {
        long div = 2;

        for (div = 2; div * div < number; div++) {
            if (number % div == 0)
                return div;
        }

        return 1;
    }
}
