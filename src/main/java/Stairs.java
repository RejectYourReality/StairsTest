public class Stairs {
    private static long L[][] = new long[501][501];

    public long calculateStairs(int cubes) {
        for(int i=0; i<501; i++) {
            for(int j=0; j<501; j++) {
                if(i == 0) {
                    L[i][j] = 1;
                    continue;
                }
                if(j == 0) {
                    L[i][j] = 0;
                    continue;
                }
                if(j > i) {
                    L[i][j] = L[i][i];
                    continue;
                }
                L[i][j] = L[i-j][j-1] + L[i][j-1];
            }
        }

        int N = cubes;
        if (0 == N)
            return 0L;
        else
            return L[N][N-1];
    }
}
