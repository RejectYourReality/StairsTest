import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StairsTest {

    private long getNumberOfStairs(int cubes) {
        Stairs stairs = new Stairs();
        return stairs.calculateStairs(cubes);
    }

    @Test
    public void zeroCubesShouldReturnZeroStairs() {
        assertEquals(0L, getNumberOfStairs(0));
    }

    @Test
    public void twoCubesShouldReturnZeroStairs() {
        assertEquals(0L, getNumberOfStairs(2));
    }

    @Test
    public void threeCubesShouldReturnOneStairs() {
        assertEquals(1L, getNumberOfStairs(3));
    }

    @Test
    public void fourCubesShouldReturnOneStairs() {
        assertEquals(1L, getNumberOfStairs(4));
    }

    @Test
    public void fiveCubesShouldReturnTwoStairs() {
        assertEquals(2L, getNumberOfStairs(5));
    }
}
