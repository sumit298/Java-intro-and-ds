import java.util.Arrays;

public class _2500_Delete_Greatest_Value_In_Each_Row {
    // You are given an m x n matrix grid consisting of positive integers.

    // Perform the following operation until grid becomes empty:

    // Delete the element with the greatest value from each row. If multiple such
    // elements exist, delete any of them.
    // Add the maximum of deleted elements to the answer.
    // Note that the number of columns decreases by one after each operation.

    public static int deleteGreatestValue(int grid[][]){
        for(int i[]: grid){
            Arrays.sort(i);
        }
        int max = 0;
        for(int j=0; j<grid[0].length; j++){
            int max_row = 0;
            for(int i=0; i<grid.length; i++){
                if(grid[i][j]>max_row){
                    max_row = grid[i][j];
                }
            }
            max += max_row;
        }
        return max;
    }
}
