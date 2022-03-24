import java.util.Arrays;
import java.util.Scanner;

public class _88_Merge_Two_Sorted_Array {
    // You are given two integer arrays nums1 and nums2, sorted in non-decreasing
    // order, and two integers m and n, representing the number of elements in nums1
    // and nums2 respectively.

    // Merge nums1 and nums2 into a single array sorted in non-decreasing order.

    // The final sorted array should not be returned by the function, but instead be
    // stored inside the array nums1. To accommodate this, nums1 has a length of m +
    // n, where the first m elements denote the elements that should be merged, and
    // the last n elements are set to 0 and should be ignored. nums2 has a length of
    // n.

    // Example 1:

    // Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    // Output: [1,2,2,3,5,6]
    // Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    // The result of the merge is [1,2,2,3,5,6] with the underlined elements coming
    // from nums1.
    // Example 2:

    // Input: nums1 = [1], m = 1, nums2 = [], n = 0
    // Output: [1]
    // Explanation: The arrays we are merging are [1] and [].
    // The result of the merge is [1].
    // Example 3:

    // Input: nums1 = [0], m = 0, nums2 = [1], n = 1
    // Output: [1]
    // Explanation: The arrays we are merging are [] and [1].
    // The result of the merge is [1].
    // Note that because m = 0, there are no elements in nums1. The 0 is only there
    // to ensure the merge result can fit in nums1.

    // Constraints:

    // nums1.length == m + n
    // nums2.length == n
    // 0 <= m, n <= 200
    // 1 <= m + n <= 200
    // -109 <= nums1[i], nums2[j] <= 109

    // Follow up: Can you come up with an algorithm that runs in O(m + n) time?
    public static void merge(int nums1[], int m, int nums2[], int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while (j >= 0) {
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }

    public static int[] merge1(int nums1[], int m, int nums2[], int n) {
        int resultant[] = new int[m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                resultant[k] = nums1[i];
                k++;
                i++;
            } else if (nums2[j] <= nums1[i]) {
                resultant[k] = nums2[j];
                k++;
                j++;
            }

        }
        while (i <= m) {
            resultant[k] = nums1[i];
            k++;
            i++;
        }
        while(j<=m){
            resultant[k] = nums2[j];
            k++;
            j++;

        }

        // copy resultant int
       return resultant;
    }
    public static void merge2(int nums1[], int m, int nums2[], int n){
        for(int i=0; i<n;i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 0, 0, 0};
        int arr2[] = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge2(arr1, m, arr2, n);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}


// Solution 1 Brute Force
//     public static void merge(int[] nums1, int m, int[] nums2, int n) {
//         if (nums2 == null || nums2.length <= 0) {
//             return;
//         }

//         int[] num = new int[m + n];
//         int idx1 = 0;
//         int idx2 = 0;
//         int idx = 0;
//         while (idx < m + n) {
//             if (idx1 < m && idx2 < n && nums1[idx1] <= nums2[idx2]) {
//                 num[idx++] = nums1[idx1++];
//             } else if (idx1 < m && idx2 < n && nums1[idx1] > nums2[idx2]) {
//                 num[idx++] = nums2[idx2++];
//             } else if (idx1 == m && idx2 < n) {
//                 num[idx++] = nums2[idx2++];
//             } else if (idx2 == n && idx1 < m) {
//                 num[idx++] = nums1[idx1++];
//             }
//         }

//         for (int i = 0; i < m + n; i++) {
//             nums1[i] = num[i];
//         }
//     }
// Analysis
// Time Complexity: O(m + n).
// Space Complexity: O(m + n).

// Solution 2 Sort
//     public static void merge_sort(int[] nums1, int m, int[] nums2, int n) {
//         for (int i = 0; i < n; i++) {
//             nums1[m + i] = nums2[i];
//         }

//         Arrays.sort(nums1);
//     }
// Analysis
// Time Complexity: O((m + n)log(m+n)).
// Space Complexity: O(1).

// Solution 3 Two Pointers
//     public static void merge_tp(int[] nums1, int m, int[] nums2, int n) {
//         int p = m - 1;
//         int q = n - 1;
//         int idx = m + n - 1;
//         int cur = 0;
//         while (p >= 0 || q >= 0) {
//             if (p < 0) {
//                 cur = nums2[q--];
//             } else if (q < 0) {
//                 cur = nums1[p--];
//             } else if (nums1[p] < nums2[q]) {
//                 cur = nums2[q--];
//             } else {
//                 cur = nums1[p--];
//             }

//             nums1[idx--] = cur;
//         }
//     }
// Analysis
// Time Complexity: O(m+n).
// Space Complexity: O(1).

// Solution 4 Best
//     public static void merge_tp_best(int[] nums1, int m, int[] nums2, int n) {
//         int idx = m + n - 1;
//         m--;
//         n--;
//         while (n >= 0) {
//             while (m >= 0 && nums1[m] >= nums2[n]) {
//                 nums1[idx--] = nums1[m--];
//             }
//             nums1[idx--] = nums2[n--];
//         }
//     }
// Analysis
// Time Complexity: O(m+n).
// Space Complexity: O(1).
