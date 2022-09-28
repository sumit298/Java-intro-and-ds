public class LongestIncreasingSubSequence {
    public static int lengthOfLIS(int[] nums){
        int result[] = new int[nums.length];
        result[0] = 1;
        for(int i=1; i<nums.length; i++){
            result[i] = 1;
        }
        return 0;
    }
}
