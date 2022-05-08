public class _1351_Count_Negative_Numbers_in_a_Sorted_Matrix {
    public static int countNegatives(int grid[][]){
        int rows = grid.length;
        int columns = grid[0].length;
        int count = 0;
        for(int i=0; i<rows;i++){
            for(int j=0; j<columns; j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        System.out.println(rows);
        System.out.println(columns);

        return count;

    }
    // Binary Search Approach
    public static int countNegativesBinary(int[][] grid) {
        int count = 0;
        for(int i=0; i<grid.length; i++){
            int left = 0;
            int right = grid[i].length-1;
            while(left<=right){
                int mid = left + (right-left)/2;
                if(grid[i][mid]<0){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            count += grid[i].length - left;
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{1,1,-1,-2}};
        System.out.println(countNegativesBinary(grid));

    }    
}
