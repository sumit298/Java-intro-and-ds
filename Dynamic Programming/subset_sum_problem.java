public class subset_sum_problem {
    public static boolean subset_sum(int[] arr, int sum) {
        // tabulation method
        boolean[][] dp = new boolean[arr.length + 1][sum + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) {
                    dp[i][j] = false;

                } else if (j == 0) {
                    dp[i][j] = true;
                } else {
                    if (dp[i - 1][j] == true) {
                        dp[i][j] = true;
                    } else {
                        int val = arr[i - 1];
                        if (j >= val) {
                            if (dp[i - 1][j - val] == true) {
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }

        // print the table with labels
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();

        }

        // subset sum values

        return dp[arr.length][sum];

    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5 };
        int sum = 9;
        System.out.println("Is subset Possible: " + subset_sum(arr, sum));
    }
}
