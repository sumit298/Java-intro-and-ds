public class _724_Find_Pivot_Index {
    // Approach: take the sum of the whole array
    // now take leftsum = 0
    // now in a loop subtract element from sum and check whether it is equal to sum on not if yes than return that index 
    // and if not then add element to the leftSum 
    public static int findPivot(int nums[]){
        int sum = 0;
        int leftSum = 0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        } 
        for(int i=0; i<nums.length; i++){
            sum-=nums[i];
            if(leftSum == sum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        System.out.println(findPivot(nums));        
    }
}
