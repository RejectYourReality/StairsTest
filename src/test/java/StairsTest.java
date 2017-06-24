import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StairsTest {

    @Test
    public void zeroCubesShouldReturnZeroStairs() {
        Stairs stairs = new Stairs();
        long numberOfStairs = stairs.calculateStairs(0);
        assertEquals(0L, numberOfStairs);
    }
}
