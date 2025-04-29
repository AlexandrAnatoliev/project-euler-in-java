import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	
    @Test
    public void testGetNearGreaterDiv15to3near3() {
    	Calculator calculator = new Calculator();
    	long result = calculator.getNearGreaterDiv(15, 3);
    	assertEquals(3, result, "15%3 == 0 near 3");
    }
    
    @Test
    public void testGetNearGreaterDiv15to2near3() {
    	Calculator calculator = new Calculator();
    	long result = calculator.getNearGreaterDiv(15, 2);
    	assertEquals(3, result, "15%3 == 0 near 3");
    }
    
    @Test
    public void testGetMaxPrimeDiv600851475143is6857() {
    	Calculator calculator = new Calculator();
    	long result = calculator.getMaxPrimeDiv(600851475143L);
    	assertEquals(6857, result, "MaxPrimeDiv 600851475143 is 6857");
    }
}
