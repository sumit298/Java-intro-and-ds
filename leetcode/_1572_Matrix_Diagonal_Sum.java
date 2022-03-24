public class _1572_Matrix_Diagonal_Sum{
    public static int diagonalSum(int[][] mat) {
        int principal = 0;
        int secondary = 0;
        int mid = 0;
        for(int i=0; i< mat.length; i++){
            principal += mat[i][i];
            secondary += mat[i][mat.length - i - 1];
            mid = mat[mat.length/2][mat[0].length/2];
        
        }
        if(mat.length %2!=0)
            secondary  = secondary - mid;
        return principal+secondary;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
}

