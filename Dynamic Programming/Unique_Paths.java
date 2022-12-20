public class Unique_Paths {
    public static int unique_paths(int m, int n){
        int dp[][] = new int[m][n];
        // fill entire array with 1 because reaching towards most right and most down will only require 1 path. And for adjacent path like 1,1 we will do addition of diagonal path.
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dp[i][j] =1;
            }
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    public static void main(String[] args) {
        int m = 3;
        int n= 7;
        System.out.println(unique_paths(m, n));
    }
}
