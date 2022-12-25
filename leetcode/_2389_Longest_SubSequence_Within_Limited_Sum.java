import java.util.Arrays;

public class _2389_Longest_SubSequence_Within_Limited_Sum {
    // not working for all cases
    public static int[] answerQueries(int nums[], int queries[]) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int sum = 0;
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (sum + nums[j] <= queries[i]) {
                    sum += nums[j];
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    // sort the array
    // prefix sum
    // binary search and on prefix sum and do count on choosing the sum
    public static int[] answerQueries2(int nums[], int queries[]) {
        int[] result = new int[queries.length];
        Arrays.sort(nums);

        int prefixArray[] = new int[nums.length];
        prefixArray[0] = nums[0];
        for (int i = 0; i < prefixArray.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + nums[i];
        }

        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];

            int index = binarySearch(prefixArray, query);
            // if element is not found then return the index of the element which is 
            if (index == -1) {
                result[i] = 0;
            } else {
                result[i] = index + 1;
            }

        }
        return result;

    }

    public static int binarySearch(int[] prefixArray, int query) {
        int start = 0;
        int end = prefixArray.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (prefixArray[mid] == query) {
                return mid;
            } else if (prefixArray[mid] < query) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {

    }
}