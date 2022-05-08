public class _1365_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    public static int[] smallerNumberthanCurrentElement(int []nums){
        int result[] = new int[nums.length];
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            result[i] = count;
            count = 0;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {8,1,2,2,3};
        int result[] = smallerNumberthanCurrentElement(arr);
        for(int i=0; i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}
