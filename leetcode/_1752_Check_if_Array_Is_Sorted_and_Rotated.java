public class _1752_Check_if_Array_Is_Sorted_and_Rotated {
    // Given an array nums, return true if the array was originally sorted in
    // non-decreasing order, then rotated some number of positions (including zero).
    // Otherwise, return false.

    // There may be duplicates in the original array.

    // Note: An array A rotated by x positions results in an array B of the same
    // length such that A[i] == B[(i+x) % A.length], where % is the modulo
    // operation.

    // Example 1:

    // Input: nums = [3,4,5,1,2]
    // Output: true
    // Explanation: [1,2,3,4,5] is the original sorted array.
    // You can rotate the array by x = 3 positions to begin on the the element of
    // value 3: [3,4,5,1,2].
    // Example 2:

    // Input: nums = [2,1,3,4]
    // Output: false
    // Explanation: There is no sorted array once rotated that can make nums.
    // Example 3:

    // Input: nums = [1,2,3]
    // Output: true
    // Explanation: [1,2,3] is the original sorted array.
    // You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.

    // Constraints:

    // 1 <= nums.length <= 100
    // 1 <= nums[i] <= 100Given an array nums, return true if the array was
    // originally sorted in non-decreasing order, then rotated some number of
    // positions (including zero). Otherwise, return false.

    // There may be duplicates in the original array.

    // Note: An array A rotated by x positions results in an array B of the same
    // length such that A[i] == B[(i+x) % A.length], where % is the modulo
    // operation.

    // Example 1:

    // Input: nums = [3,4,5,1,2]
    // Output: true
    // Explanation: [1,2,3,4,5] is the original sorted array.
    // You can rotate the array by x = 3 positions to begin on the the element of
    // value 3: [3,4,5,1,2].
    // Example 2:

    // Input: nums = [2,1,3,4]
    // Output: false
    // Explanation: There is no sorted array once rotated that can make nums.
    // Example 3:

    // Input: nums = [1,2,3]
    // Output: true
    // Explanation: [1,2,3] is the original sorted array.
    // You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.

    // Constraints:

    // 1 <= nums.length <= 100
    // 1 <= nums[i] <= 100
    public static boolean checkSortedAndRotated(int nums[]) {
        int count = 0; 
        for(int i=1; i<nums.length;i++){
            if(nums[i-1]> nums[i]){
                count++;
            }
            if(nums[i-1]> nums[0]){
                count++;
            }
        }
        return count<= 1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(checkSortedAndRotated(nums));
    }
}

// Solution:
// Find the minimum element in the array.
// Now, if the array is sorted and then rotate all the elements before the
// minimum element will be in increasing order and all elements after the
// minimum element will also be in increasing order.
// Check if all elements before minimum element are in increasing order.
// Check if all elements after minimum element are in increasing order.
// Check if the last element of the array is smaller than the starting element.
// If all of the above three conditions satisfies then print YES otherwise print
// NO.
