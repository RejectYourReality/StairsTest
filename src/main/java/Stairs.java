public class Stairs {
    private static long L[][] = new long[501][501];

    private static long solve(int i, int j) {
        if(i == 0) return 1;
        if(j == 0) return 0;
        if(j > i) return L[i][i];
        return L[i-j][j-1] + L[i][j-1];
    }

    public static long calculateStairs(int cubes) {
        for(int i=0; i<501; i++) {
            for(int j=0; j<501; j++) {
                L[i][j] = solve(i,j);
            }
        }
        int N = cubes;
        return solve(N, N) - 1;
    }

    public static void main(String[] args) {
        System.out.println(calculateStairs(500));
    }
}
