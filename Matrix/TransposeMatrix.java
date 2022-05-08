public class TransposeMatrix {
    public static int[][] transpose(int arr[][]){
        int row = arr.length;
        int column = arr[0].length;
        int result[][] = new int[row][column];
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                result[i][j] = arr[j][i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = transpose(arr);
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
