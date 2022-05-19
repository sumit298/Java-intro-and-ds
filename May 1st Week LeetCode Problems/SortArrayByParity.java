public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] A) {
        int j = 0;
        for(int i=0; i<A.length;i++){
            if(A[i]%2==0){
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                j++;

            }
        }
        return A;
    
    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,6,7,8};
        int result[] = sortArrayByParity(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
