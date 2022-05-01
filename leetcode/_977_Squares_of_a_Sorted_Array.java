import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        int result[] = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            result[i] = (int)Math.pow(nums[i], 2);
        }
        
        Arrays.sort(result);
        return result;
    }

    public int[] sortedSquares1(int[] nums) {
        int[] sol = new int[nums.length];
        int i=0,j=nums.length-1;
        for (int k=sol.length-1;k>=0;k--){
            if (Math.abs(nums[i])>Math.abs(nums[j])){
                sol[k] = nums[i]*nums[i];
                i++;
            }else {
                sol[k] = nums[j]*nums[j];
                j--;
             }
        }
        return sol;
    }
}
