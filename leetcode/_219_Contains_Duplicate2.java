public class _219_Contains_Duplicate2 {
    // Given an integer array nums and an integer k, return true if there are two
    // distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
    // - j) <= k.

    // Example 1:

    // Input: nums = [1,2,3,1], k = 3
    // Output: true
    // Example 2:

    // Input: nums = [1,0,1,1], k = 1
    // Output: true
    // Example 3:

    // Input: nums = [1,2,3,1,2,3], k = 2
    // Output: false

    // Constraints:

    // 1 <= nums.length <= 105
    // -109 <= nums[i] <= 109
    // 0 <= k <= 105
    public static boolean containsNearbyDuplicate(int nums[], int k) {
        // Brute Force Aproach
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && Math.abs(i - j) <= k) {
                    return true;
                }
            }
        }
        return false;

        // Map<Integer, Integer> indices = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        // Integer lastIndex = indices.put(nums[i], i);
        // if (lastIndex != null && (i - lastIndex) <= k)
        // return true;
        // }
        // return false;
        // }

    }
    // By using hashmaps

    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        System.out.println(containsNearbyDuplicate(arr, 3));
    }
}
