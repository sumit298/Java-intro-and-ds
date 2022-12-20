public class _200_Number_of_Islands {
//     Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

// Example 1:

// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1
    public static int numIsIslands(char grid[][]){
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
    public static void dfs(char grid[][], int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    // 2nd method

    public static int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i, j);
                }
            }
        }
        return count;
    }
}


// This is a method that counts the number of islands in a 2D grid of characters, where an island is defined as a group of connected 1s (where two 1s are considered connected if they are neighbors horizontally or vertically).

// The method first initializes a variable count to 0. It then enters a loop that iterates over each cell in the grid. If the cell is a 1, the method increments count and calls a helper method dfs to mark all the connected 1s as 0s (so that they are not counted again).

// The dfs method uses a depth-first search algorithm to visit all the neighbors of the current cell and mark them as 0s. If the current cell is out of bounds or is a 0, the method returns without doing anything.

// When the outer loop is finished, the method returns count, which is the number of islands in the grid.


// int count = 0;
// for(int i = 0; i < grid.length; i++){
//   for(int j = 0; j < grid[0].length; j++){
//     if(grid[i][j] == '1'){
//       count++;
//       dfs(grid, i, j);
//     }
//   }
// }
// return count;
// This loop iterates over each cell in the grid. If the cell is a 1, it increments count and calls the dfs method to mark all the connected 1s as 0s.

// public static void dfs(char grid[][], int i, int j){
//   if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
//     return;
//   }
//   grid[i][j] = '0';
//   dfs(grid, i + 1, j);
//   dfs(grid, i - 1, j);
//   dfs(grid, i, j + 1);
//   dfs(grid, i, j - 1);
// }
// The dfs method uses a depth-first search algorithm to visit all the neighbors of the current cell and mark them as 0s. If the current cell is out of bounds or is a 0, the method returns without doing anything.