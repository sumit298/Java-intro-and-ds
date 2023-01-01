public class Unique_Paths_3 {
    // Description: You are given an m x n integer array grid where grid[i][j] could
    // be:

    // 1 representing the starting square. There is exactly one starting square.
    // 2 representing the ending square. There is exactly one ending square.
    // 0 representing empty squares we can walk over.
    // -1 representing obstacles that we cannot walk over.
    // Return the number of 4-directional walks from the starting square to the
    // ending square, that walk over every non-obstacle square exactly once.
    public static int uniquePathsIII(int grid[][]) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int start = 0;
        int end = 0;
        // count the number of 0s in the grid
        // find the start and end
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    count++;
                } else if (grid[i][j] == 1) {
                    start = i * m + j;
                } else if (grid[i][j] == 2) {
                    end = i * m + j;
                }
            }
        }

        // dfs consist of grid, source, destination, count, result
        return dfs(grid, start, end, count, 0);
    }

    public static int dfs(int grid[][], int src, int dest, int count, int res) {
        int n = grid.length;
        int m = grid[0].length;
        int i = src / m;
        int j = src % m;
        // base case
        if (src == dest) {
            if (count == -1) {
                return res + 1;
            }
            return res;
        }
        // mark the current cell as visited
        grid[i][j] = -1;
        // nbr is the neighbour of the source
        // to find the neighbour of the source, we need to iterate through the grid
        int nbrs[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        for (int nbr[] : nbrs) {
            int r = i + nbr[0];
            int c = j + nbr[1];
            if (r >= 0 && c >= 0 && r < n && c < m && grid[r][c] != -1) {
                res = dfs(grid, r * m + c, dest, count - 1, res);
            }
        }
        // unmark the current cell
        grid[i][j] = 0;
        return res;
    }

}
