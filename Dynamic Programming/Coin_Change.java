public class Coin_Change {
    public static int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length + 1][amount + 1];
        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= amount; i++) {
            dp[0][i] = Integer.MAX_VALUE;
            // why this Integer.MAX_VALUE?
            // because we need to return -1 if we cannot find a solution
            

        }
        for (int i = 1; i <= coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if (j < coins[i - 1]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
                }
            }
        }
        // for printing the matrix
        for (int i = 0; i < coins.length + 1; i++) {
            for (int j = 0; j < amount + 1; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[coins.length][amount] == Integer.MAX_VALUE ? -1 : dp[coins.length][amount];

    }

    public static void main(String[] args) {
        int[] coins = { 1, 5, 6, 8 };
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }
}
