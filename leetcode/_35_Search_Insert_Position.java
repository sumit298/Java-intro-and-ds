// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1
// Example 3:

// Input: nums = [1,3,5,6], target = 7
// Output: 4

// Constraints:

// 1 <= nums.length <= 104
// -104 <= nums[i] <= 104
// nums contains distinct values sorted in ascending order.
// -104 <= target <= 104

public class _35_Search_Insert_Position {
    public static int search_insert(int nums[], int target) {
        if (nums.length == 0)
            return 0;
        // if (nums.length == 1) {
        // if (nums[0] >= target)
        // return 0;
        // if (nums[0] < target)
        // return 1;
        // }
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                break;
            } else if (nums[i] > target) {
                index = i;
                break;
            } else {
                index = i + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 6 };
        int index = search_insert(nums, 5);
        System.out.println(index);
    }
}
