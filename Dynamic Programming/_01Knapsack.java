public class _01Knapsack {
    public static int knapsack_weight_profit(int[] profit, int weight[], int capacity, int noofItems) {
        int[][] dpMatrix = new int[noofItems + 1][capacity + 1];
        for (int i = 0; i <= noofItems; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (i == 0 || j == 0) {
                    dpMatrix[i][j] = 0;
                } else if (weight[i - 1] <= j) {
                    dpMatrix[i][j] = Math.max(dpMatrix[i - 1][j], dpMatrix[i - 1][j - weight[i - 1]] + profit[i - 1]);
                } else {
                    dpMatrix[i][j] = dpMatrix[i - 1][j];
                }
            }
        }

        // print dp matrix
        for(int i=0; i<dpMatrix.length; i++){
            for(int j=0; j<dpMatrix[0].length;j++){
                System.out.print(dpMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return dpMatrix[noofItems][capacity];
    }
    

    public static void main(String[] args) {
        int[] profit = { 1,4,5,7 };
        int[] weight = { 1,3,4,5 };
        int capacity = 7;
        int noofItems = profit.length;
        System.out.println(knapsack_weight_profit(profit, weight, capacity, noofItems));

    }

}
