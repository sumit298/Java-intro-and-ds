public class _1480_Running_Sum_of_1d_Array {
    public static int[] runningSum(int arr[]){
        int result[] = new int[arr.length];
        result[0] = arr[0];  // for 1st element is returned as it was before.
        for(int i=1; i<arr.length;i++){
            result[i] =result[i-1] + arr[i];
            // here result[1] will be sum of result[0] + arr[1]
            // result[2] will be sum of result[1] + arr[2]
            // result[3] will be sum of result[2] + arr[3]
            // result[4] will be sum of result[3] + arr[4] and so on...
        }
        return result;
    }
    // Time Complexity: O(n)
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int result[] = runningSum(arr);
        for(int i=0; i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
