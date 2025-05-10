import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	
    @Test
    public void testGetMinDiv15to3is3() {
    	Calculator calculator = new Calculator();
    	long result = calculator.getMinDiv(15, 3);
    	assertEquals(3, result, "15%3 == 0 minDiv is 3");
    }
    
    @Test
    public void testGetMinDiv15to2is3() {
    	Calculator calculator = new Calculator();
    	long result = calculator.getMinDiv(15, 2);
    	assertEquals(3, result, "15%3 == 0 minDiv is 3");
    }
    
    @Test
    public void testGetMaxPrimeDiv600851475143is6857() {
    	Calculator calculator = new Calculator();
    	long result = calculator.getMaxPrimeDiv(600851475143L);
    	assertEquals(6857, result, "MaxPrimeDiv 600851475143 is 6857");
    }

    @Test
    public void testGetMaxPrimeDiv100is5() {
    	Calculator calculator = new Calculator();
    	long result = calculator.getMaxPrimeDiv(100);
    	assertEquals(5, result, "MaxPrimeDiv 100 is 5");
    }

    @Test
    public void testGetMaxPrimeDiv50is5() {
    	Calculator calculator = new Calculator();
    	long result = calculator.getMaxPrimeDiv(50);
    	assertEquals(5, result, "MaxPrimeDiv 50 is 5");
    }

    @Test
    public void testGetMaxPrimeDiv25is5() {
    	Calculator calculator = new Calculator();
    	long result = calculator.getMaxPrimeDiv(25);
    	assertEquals(5, result, "MaxPrimeDiv 25 is 5");
    }

    @Test
    public void testGetMinDiv25to2is5() {
    	Calculator calculator = new Calculator();
    	long result = calculator.getMinDiv(25, 2);
    	assertEquals(5, result, "25%5 == 0 minDiv is 5");
    }

    @Test
    public void testGetMinDiv25to5is5() {
    	Calculator calculator = new Calculator();
    	long result = calculator.getMinDiv(25, 5);
    	assertEquals(5, result, "25%5 == 0 minDiv is 5");
    }

    @Test
    public void testGetMinDiv5to5is1() {
    	Calculator calculator = new Calculator();
    	long result = calculator.getMinDiv(5, 5);
    	assertEquals(1, result, "5%1 == 0 minDiv is 1");
    }

    @Test
    public void testGetMaxPrimeDiv5is5() {
    	Calculator calculator = new Calculator();
    	long result = calculator.getMaxPrimeDiv(5);
    	assertEquals(5, result, "MaxPrimeDiv 5 is 5");
    }
}
