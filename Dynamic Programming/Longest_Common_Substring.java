public class Longest_Common_Substring {
    public static int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // Print Matrix
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length;j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return dp[m][n];

    }

    public static void main(String[] args) {
        String s1 = "acbdaf";
        String s2 = "acbcf";

        System.out.println(longestCommonSubsequence(s1, s2));

    }

}