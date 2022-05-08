public class _283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    // Another aproach
    public void moveZeroes2(int[] nums) {
        int n = nums.length;
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                m++;
            } else if (m != 0) {
                nums[i - m] = nums[i];
                nums[i] = 0;
            }
        }

    }
}
