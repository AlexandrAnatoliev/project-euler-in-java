import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		long result = calculator.getMinDiv(15);
		assertEquals(3, result, "15%3 == 0");
	}
}