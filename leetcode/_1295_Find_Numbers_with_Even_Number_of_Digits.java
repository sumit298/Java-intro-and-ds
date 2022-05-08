public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums){
        int count = 0;
        int itemCount = 0;
        for(int i=0; i<nums.length; i++){
            while(nums[i]!=0){
                nums[i] /= 10;
                count++;
            }
            if(count%2==0){
                itemCount++;
            }
            count = 0;
        }
        return itemCount;
    }
    public static void main(String[] args) {
        int nums[] = {437,315,322,431,686,264,442};
        int result = findNumbers(nums);
        System.out.println(result);
    }
}
