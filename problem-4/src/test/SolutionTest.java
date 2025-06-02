import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
  @Test
  public void invert_123456_to_654321() {
    Solution solution = new Solution();
    int result = Solution.invert(123456);
    assertEquals(654321, result, "123456 invert to 654321");
  }
}
