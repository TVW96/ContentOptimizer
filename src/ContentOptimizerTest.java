import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContentOptimizerTest {

    @Test
    public void testNormalCases() {
        // Normal test cases
        assertEquals("edisisreV", ContentOptimizer.reverseString("Versiside"));
        assertEquals("!dlroW ,olleH", ContentOptimizer.reverseString("Hello, World!"));
        assertEquals("gnitset", ContentOptimizer.reverseString("testing"));
    }

    @Test
    public void testEdgeCases() {
        // Edge test cases
        assertEquals("", ContentOptimizer.reverseString("")); // empty string
        assertEquals("A", ContentOptimizer.reverseString("A")); // single character
        assertEquals("aa", ContentOptimizer.reverseString("aa")); // string with same characters
    }
}
