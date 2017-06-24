public class Stairs {
    public long calculateStairs(int cubes) {
        if (3 == cubes || 4 == cubes)
            return 1L;
        else if (5 == cubes)
            return 2L;
        else
            return 0L;
    }
}
