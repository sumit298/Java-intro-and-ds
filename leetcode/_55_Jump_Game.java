public class _55_Jump_Game {
    public static boolean canJump(int nums[]) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) {
                return false;
            }
            max = Math.max(max, i + nums[i]);
        }
        return true;
    }

    // Alisha approach
    public static boolean canJump2(int nums[]) {
        // Working from the last index to the first index.
        int index = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] + i > index) {
                index = i;
            }
        }
        if (index == 0) {
            return true;
        } else {
            return false;
        }
    }
}
