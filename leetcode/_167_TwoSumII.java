public class _167_TwoSumII {
    public static int[] TwoSum(int arr[], int target) {
        int result[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    arr[0] = i + 1;
                    arr[1] = j + 1;
                }
            }
        }
        return result;
    }

    public static int[] twoSumPointers(int arr[], int target) {
        int left_pointer = 0;
        int right_pointer = arr.length - 1;
        while (left_pointer < right_pointer) {
            if (arr[left_pointer] + arr[right_pointer] > target) {
                right_pointer--;
            } else if (arr[left_pointer] + arr[right_pointer] < target) {
                left_pointer++;
            } else {
                return new int[] { left_pointer + 1, right_pointer + 1 };
            }
        }
        return new int[] { -1, -1 };
    }

   

    public static void main(String[] args) {
        int arr[] = { 2, 7, 9, 15, 20 };
        int result[] = twoSumPointers(arr, 16);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
