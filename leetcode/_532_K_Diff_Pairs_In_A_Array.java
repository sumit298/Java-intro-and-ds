import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _532_K_Diff_Pairs_In_A_Array {
    public static int findPairs(int nums[], int k) {
        if (nums == null || nums.length == 0 || k < 0)
            return 0;
        int count = 0;
        Arrays.sort(nums);
        int i = 0;
        int j = 1;
        while (i < nums.length && j < nums.length) {
            if (i == j || nums[j] - nums[i] < k) {
                j++;
            } else if (nums[j] - nums[i] > k) {
                i++;
            } else {
                count++;
                i++;
                j++;
                while (i < nums.length && nums[i] == nums[i - 1])
                    i++;
            }
        }
        return count;
    }

    public int findPairs2(int[] arr, int k) {
        int ans = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int oldval = hm.getOrDefault(arr[i], 0);
            hm.put(arr[i], oldval + 1);
        }

        for (int i : hm.keySet()) {
            if ((k == 0 && hm.get(i) > 1) || (k != 0 && hm.containsKey(i + k))) {
                ans++;
            }
        }
        return ans;
    }

}