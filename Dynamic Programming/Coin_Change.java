public class Coin_Change {
    public static int coinChange(int[] coins, int amount) {
        int dp[][] = new int[coins.length + 1][amount + 1];
        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 1; i <= amount; i++) {
            dp[0][i] = amount + 1;
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

    public static int coinChange2(int coins[], int amount) {
        int dp[] = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i < coins.length; i++) {
            dp[i] = amount + 1;
        }
        for (int i = 1; i < amount + 1; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - j >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - j]);
                }
            }
        }
        return dp[amount] != amount + 1 ? dp[amount] : -1;
    }

    public static void main(String[] args) {
        int[] coins = { 1,2,3,4,5 };
        int amount = 16;
        System.out.println(coinChange(coins, amount));
    }
    // Description: Given a set of coins and a total amount of money, find the minimum number of coins needed to make the change.
    // Input: coins = [1, 2, 5], amount = 11

    // Time Complexity: O(n*amount)
    // Space Complexity: O(amount)
    
}


// What is Hamiltonian Path?
// A Hamiltonian path is a path in a graph that visits each vertex exactly once.
// What is Hamiltonian Cycle?