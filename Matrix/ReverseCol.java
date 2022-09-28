public class ReverseCol {
    public static void reverseCol(int arr[][]){
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0; i<row; i++){
            for(int j = 0; j<col / 2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[col-1-i][j];
                arr[col-1-i][j] = temp;
            }
        }
        // for (int[] ints : arr) {
        //     for (int j = 0; j < col; j++) {
        //         System.out.print(ints[j] + " ");
        //     }
        // }
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        reverseCol(arr);
    }
}
