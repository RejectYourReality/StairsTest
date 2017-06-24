import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StairsTest {

    @Test
    public void zeroCubesShouldReturnZeroStairs() {
        Stairs stairs = new Stairs();
        long numberOfStairs = stairs.calculateStairs(0);
        assertEquals(0L, numberOfStairs);
    }

    @Test
    public void twoCubesShouldReturnZeroStairs() {
        Stairs stairs = new Stairs();
        long numberOfStairs = stairs.calculateStairs(2);
        assertEquals(0L, numberOfStairs);
    }
    
    @Test
    public void threeCubesShouldReturnOneStairs() {
        Stairs stairs = new Stairs();
        long numberOfStairs = stairs.calculateStairs(3);
        assertEquals(1L, numberOfStairs);
    }
}
