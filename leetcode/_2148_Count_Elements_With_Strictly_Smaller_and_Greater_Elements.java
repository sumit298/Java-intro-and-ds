public class _2148_Count_Elements_With_Strictly_Smaller_and_Greater_Elements {

    public static int countElements(int nums[]) {
        if (nums.length <= 2) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minCount = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        if (min == max) {
            return 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == max) {
                maxCount++;

            }
            if (nums[i] == min) {
                minCount++;
            }
        }
        return (nums.length - minCount - maxCount);
    }

    public static void main(String[] args) {
        int arr[] = { -3, 3, 3, 90 };
        System.out.println(countElements(arr));
    }
}
