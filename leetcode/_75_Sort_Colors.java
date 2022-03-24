public class _75_Sort_Colors {
    // Given an array nums with n objects colored red, white, or blue, sort them
    // in-place so that objects of the same color are adjacent, with the colors in
    // the order red, white, and blue.

    // We will use the integers 0, 1, and 2 to represent the color red, white, and
    // blue, respectively.

    // You must solve this problem without using the library's sort function.

    // Example 1:

    // Input: nums = [2,0,2,1,1,0]
    // Output: [0,0,1,1,2,2]
    // Example 2:

    // Input: nums = [2,0,1]
    // Output: [0,1,2]

    // Constraints:

    // n == nums.length
    // 1 <= n <= 300
    // nums[i] is either 0, 1, or 2.

    // Follow up: Could you come up with a one-pass algorithm using only constant
    // extra space?

    public static void SortColors(int nums[]) {
        int left_pointer = 0;
        int right_pointer = nums.length - 1;
        int i_pointer = 0;
        while (i_pointer <= right_pointer) {
            if (nums[i_pointer] == 0) {
                swap(nums, left_pointer, i_pointer);
                left_pointer += 1;
            } else if (nums[i_pointer] == 2) {
                swap(nums, i_pointer, right_pointer);
                right_pointer -= 1;
                i_pointer -= 1;
            }
            i_pointer += 1;
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 2, 2, 0, 0, 1, 1, 2 };
        SortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
