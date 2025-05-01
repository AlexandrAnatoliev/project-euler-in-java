/**
 * 
 * This class performs calculations
 */

public class Calculator {

    public long getNearGreaterDiv(long number, long div) {
                
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
    
    public long getMaxPrimeDiv(long num) {
        long minDiv = getNearGreaterDiv(num, 2);

        while (minDiv != 1) {
            num = num / minDiv;
            minDiv = getNearGreaterDiv(num, minDiv);
        }
        return num;
    }
    
}
