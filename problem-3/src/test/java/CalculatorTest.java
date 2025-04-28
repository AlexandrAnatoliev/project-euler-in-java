import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.getMinDiv(15);
		assertEquals(3, result, "15%3 == 0");
	}
	
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
}