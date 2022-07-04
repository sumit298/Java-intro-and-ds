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

    public int coinChange2(int[] coins, int amount) {
        int n = coins.length;
        
        int t[][] = new int[n + 1][amount + 1];
        
        return subsetmin(coins, amount, n, t);
    }
    public int subsetmin(int coins[], int sum, int n, int t[][]){
	    for(int i = 0; i < n + 1; i++){
	        for(int j = 0; j < sum + 1; j++){
	            if(i == 0) t[i][j] = Integer.MAX_VALUE - 1;
	            if(j == 0) t[i][j] = 0;
	        }
	    }
	    
	    for(int j = 1; j < sum + 1; j++){
	        if(j % coins[0] == 0) t[n][sum] = j / coins[0];
	        else t[n][sum] = Integer.MAX_VALUE - 1;
	    }
	    
	    for(int i = 1; i < n + 1; i++){
	        for(int j = 1; j < sum + 1; j++){
	            if(coins[i - 1] <= j){
	                t[i][j] = Math.min(t[i][j - coins[i - 1]] + 1, t[i - 1][j]);
	            }
	            else{
	                t[i][j] = t[i - 1][j];
	            }
	        }
	    }
	    return t[n][sum]==Integer.MAX_VALUE-1 ? -1: t[n][sum];
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

