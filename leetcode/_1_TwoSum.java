public class _1_TwoSum {
    // Approach 1: Brute Force
    public static int[] PairSumOfArray(int arr[], int target) {
        int result[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    // optimal solution remaining
    public static void main(String[] args) {
        int arr[] = ArrayUse.arrInput();
        int result[] = PairSumOfArray(arr, 7);
        System.out.print(result[0] + " " + result[1]);
    }
}
