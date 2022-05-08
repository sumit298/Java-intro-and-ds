public class MatrixChainMultiplication {
    public static int MatrixChainMultiply(int arr[], int n) {
        int dp[][] = new int[n][n];
        for (int i = 1; i < n; i++) {
            dp[i][i] = 0;
        }
        for (int l = 2; l < n; l++) {
            for (int i = 1; i < n - l + 1; i++) {
                int j = i + l - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int q = dp[i][k] + dp[k + 1][j] + arr[i - 1] * arr[k] * arr[j];
                    if (q < dp[i][j]) {
                        dp[i][j] = q;
                    }
                }
            }
        }
        

        return dp[1][n - 1];
    }

    public static void main(String[] args) {
        int arr[] = { 3,2,4,2,5 };
        int n = arr.length;
        System.out.println(MatrixChainMultiply(arr, n));
        
    }
    // Time Complexity: O(n^3)
    // Space Complexity: O(n^2)
    
}

// How this is working
// dp[i][j] = min(dp[i][k] + dp[k+1][j] + arr[i-1]*arr[k]*arr[j])
// dp[i][j] = min(dp[i][j]);
// First I am creating for loop starting from 2 to n-1
// Then I am creating for loop starting from 1 to n-l
// then checking for each k if dp[i][k] + dp[k+1][j] + arr[i-1]*arr[k]*arr[j] is less than dp[i][j]
// if it is then dp[i][j] = q
// then I am returning dp[1][n-1]

