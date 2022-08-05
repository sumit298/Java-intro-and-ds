public class Kth_Smallest_number_in_sorted_matrix {
    // Given an n x n matrix where each of the rows and columns is sorted in
    // ascending order, return the kth smallest element in the matrix.

    // Note that it is the kth smallest element in the sorted order, not the kth
    // distinct element.

    // You must find a solution with a memory complexity better than O(n2).
    public int kthSmallest(int[][] matrix, int k) {
        int length = matrix.length;
        int low = matrix[0][0];
        int high = matrix[length-1][length-1];
        while(low<=high){
            int mid = low + (high - low) /2;
            // int countlessThan = 
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}
