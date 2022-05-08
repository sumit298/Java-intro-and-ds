public class TravellingSalesmen {
    public static int travellingSalesmen(int[][] graph, int n) {
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }
        for (int l = 2; l < n; l++) {
            for (int i = 1; i < n - l + 1; i++) {
                int j = i + l - 1;
                for (int k = i; k < j; k++) {
                    int q = dp[i][k] + dp[k + 1][j] + graph[i - 1][k] * graph[k][j];
                    if (q < dp[i][j]) {
                        dp[i][j] = q;
                    }
                }

            }
        }
        return dp[1][n - 1];
    }

    public static void main(String[] args) {
        int[][] graph = { { 0, 20, 30, 10, 11 }, { 15, 0, 16, 4, 2 }, { 3, 5, 0, 2, 4 }, { 19, 6, 18, 0, 3 },
                { 16, 4, 7, 16, 0 } };
        int n = graph.length;
        System.out.println(travellingSalesmen(graph, n));

    }
}
