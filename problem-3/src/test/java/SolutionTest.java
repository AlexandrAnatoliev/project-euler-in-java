import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		int result = calculator.add(2, 3);
		assertEquals(5, result, "2+3=5");
	}
}