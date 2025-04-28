/**
 * 
 * This class performs calculations
 */

public class Calculator {

    public int getMinDiv(int number) {
        int div = 2;

        for (div = 2; div * div < number; div++) {
            if (number % div == 0)
                return div;
        }

        return 1;
    }
    
    public long getNearGreaterDiv(long div, long number) {
                
        if(number % div == 0) {
        	return div;
        }
        else if (div % 2 == 0){
        	div++;
        }
        else {
        	div += 2;
        }

        for (long i = div; i * i < number; i += 2) {
            if (number % i == 0)
                return i;
        }

        return 1;
    }
}
