import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
  private Solution solution;

  @BeforeEach
  void setUp() {
    Solution solution = new Solution();
  }

  @Test
  public void invert_123456_to_654321() {
    int result = solution.invert(123456);
    assertEquals(654321, result, "123456 invert to 654321");
  }

  @Test
  public void isPalindrome_987789 () {
    boolean palindrome = solution.isPalindrome(987789);
    assertTrue(palindrome);
  }
}
