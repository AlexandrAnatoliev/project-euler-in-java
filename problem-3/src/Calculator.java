/**
 * 
 * This class performs calculations
 */

class Calculator {

    long getMinDiv(long number, long div) {
    	if((number % div == 0) && (div * div <= number)) {
    		return div;
    	}
                
        div = (div % 2 == 0) ? (div + 1) : (div);
        
        for (long i = div; i * i <= number + 1; i += 2) {
            if (number % i == 0)
                return i;
        }

        return 1;
    }
    
    long getMaxPrimeDiv(long num) {
    	long minDiv = 2;

    	do {
            minDiv = getMinDiv(num, minDiv);
            num = num / minDiv;
    	} while (minDiv != 1);
    	
        return num;
    }
    
}
