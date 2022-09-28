import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

public class _287_Find_The_Duplicate_Number {
    public static int findDuplicateSortedApproach(int arr[]) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return arr[i];
            }
        }
        return -1;
    }
    // Time Complexity: O(nlogn)
    // Space Complexity: O(1)

    public static int findDuplicatesHashSetApproach(int arr[]) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }

    public static int findDuplicatesFloydApproach(int arr[]) {
        int fast = 0;
        int slow = 0;
        while (true) {
            slow = arr[slow];
            fast = arr[arr[fast]];
            if (slow == fast) {
                break;
            }
        }
        int slow2 = 0;
        while (true) {
            slow = arr[slow];
            slow2 = arr[slow2];
            if (slow == slow2) {
                break;
            }
        }
        return slow;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static void quickSort(int arr[], int start, int end) {
        if (start <= end) {
            int mid = partition(arr, start, end);
            quickSort(arr, start, mid - 1);
            quickSort(arr, mid + 1, end);
        }

    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[start];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (pivot < arr[i])
                count++;
        }
        int temp = pivot;
        pivot = arr[start + count];
        arr[start + count] = temp;

        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            if (arr[i] < pivot && arr[j] > pivot) {

            }
        }

        return pivot;
    }

    public static int findDuplicatesNegativeMarkingApproach(int arr[]) {
        int duplicate = -1;
        for (int i = 0; i < arr.length; i++) {
            int current = Math.abs(arr[i]);
            if (arr[current] < 0) {
                duplicate = current;
                break;
            }

            arr[current] *= -1;

        }
        return duplicate;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 1, 3, 3 };
        System.out.println(findDuplicatesNegativeMarkingApproach(arr));
    }

}
