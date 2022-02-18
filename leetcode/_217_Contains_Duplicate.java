import java.util.Arrays;

public class _217_Contains_Duplicate {
    public static boolean contains_Duplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 23, 10, 5, 66 };
        System.out.println(contains_Duplicate(arr));
    }
}