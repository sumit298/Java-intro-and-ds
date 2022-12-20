import java.util.HashMap;

public class MinimumFallingPathSum{
    public static int  MinimumSum(int [][] matrix){
        // MyApproach: find min from each row and add them to the minimum sum and return the minimum sum but you can go left or right or diagonal from there. So this will not work. only finding the minimum from each row will not work.

        int minSum = 0;
        for(int i = 0; i < matrix.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                }
            }
            minSum += min;
        }
        return minSum;

    }

    public static int MinimumSum2(int matrix[][]){
        // Approach 2: We can use dynamic programming to solve this problem. We can use the same matrix to store the minimum sum from each row. We can start from the second row and find the minimum sum from the previous row and add it to the current element. We can do this for all the elements in the current row. We can do this for all the rows and return the minimum sum from the last row.
        // Time Complexity: O(n^2)
        // Space Complexity: O(1)
        for(int i = 1; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(j == 0){
                    matrix[i][j] += Math.min(matrix[i-1][j], matrix[i-1][j+1]);
                }else if(j == matrix[0].length - 1){
                    matrix[i][j] += Math.min(matrix[i-1][j], matrix[i-1][j-1]);
                }else{
                    matrix[i][j] += Math.min(matrix[i-1][j], Math.min(matrix[i-1][j-1], matrix[i-1][j+1]));
                }
            }
        }
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < matrix[0].length; i++){
            if(matrix[matrix.length - 1][i] < minSum){
                minSum = matrix[matrix.length - 1][i];
            }
        }
        return minSum;
    }

    public static int MinimumSumRecursive(int matrix[][]){
        // int row = matrix.length;
        int col = matrix[0].length;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<col;i++){
            ans = Math.min(ans, recursiveHelper(0, i, matrix));
        }
        return ans;
    }
    private static int recursiveHelper(int i, int j, int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        // base case
        if(i==row){
            return 0;
        }
        // if out of bounds of matrix
        if(j<0 || j>=col){
            return Integer.MAX_VALUE;
        }

        int option1 = recursiveHelper(i+1, j-1, matrix);
        int option2 = recursiveHelper(i+1, j, matrix);
        int option3 = recursiveHelper(i+1, j+1, matrix);

        // return the minimum sum of all the options
        return matrix[i][j] + Math.min(option1, Math.min(option2, option3));
        
    }

    public static int MinimumSumMemoized(int matrix[][]){
        // int row = matrix.length;
        int col = matrix[0].length;
        int ans = Integer.MAX_VALUE;
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<col; i++){
            ans = Math.min(ans, memoizedHelper(0, i, matrix, map));
        }
        return ans;
    }

    private static int memoizedHelper(int i, int j, int[][] matrix, HashMap<String, Integer> map) {
        int row = matrix.length;
        int col = matrix[0].length;
        // base case
        if(i==row){
            return 0;
        }
        // if out of bounds of matrix
        if(j<0 || j>=col){
            return Integer.MAX_VALUE;
        }

        // check if the value is already present in the map if yes then storing unique key
        String key = i + " unique " + j;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int option1 = memoizedHelper(i+1, j-1, matrix, map);
        int option2 = memoizedHelper(i+1, j, matrix, map);
        int option3 = memoizedHelper(i+1, j+1, matrix, map);

        // return the minimum sum of all the options
    
        int ans = matrix[i][j] + Math.min(option1, Math.min(option2, option3));
        map.put(key, ans);
        return ans;
    }

    public static void main(String[] args) {
        int [][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
        System.out.println(MinimumSumMemoized(matrix));
    }
}