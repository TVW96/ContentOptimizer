import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContentOptimizerTest {

    @Test
    public void testNormalCases() {
        // Normal test cases
        assertEquals("edisisreV", ContentOptimizer.stringReversal("Versiside"));
        assertEquals("!dlroW ,olleH", ContentOptimizer.stringReversal("Hello, World!"));
        assertEquals("gnitset", ContentOptimizer.stringReversal("testing"));
    }

    @Test
    public void testEdgeCases() {
        // Edge test cases
        assertEquals("", ContentOptimizer.stringReversal("")); // empty string
        assertEquals("A", ContentOptimizer.stringReversal("A")); // single character
        assertEquals("aa", ContentOptimizer.stringReversal("aa")); // string with same characters
    }
}
