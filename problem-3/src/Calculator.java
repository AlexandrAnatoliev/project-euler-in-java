/**
 * 
 * This class performs calculations
 */

class Calculator {

    long getMinDiv(long number, long div) {
                
        if(number % div == 0) {
        	return div;
        }

        div = (div % 2 == 0) ? (div + 1) : (div + 2);
        
        for (long i = div; i * i < number; i += 2) {
            if (number % i == 0)
                return i;
        }

        return 1;
    }
    
    long getMaxPrimeDiv(long num) {
        long minDiv = getMinDiv(num, 2);

        while (minDiv != 1) {
            num = num / minDiv;
            minDiv = getMinDiv(num, minDiv);
        }
        return num;
    }
    
}
