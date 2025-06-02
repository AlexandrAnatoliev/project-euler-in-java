import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
  @Test
  public void invert_123456_to_654321() {
    Solution solution = new Solution();
    int result = solution.invert(123456);
    assertEquals(654321, result, "123456 invert to 654321");
  }

  @Test
  public void isPalindrome_987789 () {
    Solution solution = new Solution();
    boolean palindrome = solution.isPalindrome(987789);
    assertTrue(palindrome);
  }
}
