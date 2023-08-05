public class Jump_game {
    public static boolean jump_game(int nums[]){
        int currentIndex = nums.length-1;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]+ i >= currentIndex){
                currentIndex = i;

            }
            
        }
        return currentIndex == 0; 
    }
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        System.out.println(jump_game(nums));
    }
}
