public class Jump_game_2 {
    public static int jump(int nums[]){
        int farthest = 0;
        int jumps = 0;
        int current = 0;
        // you have to reach last index -1 to reach the last index
        for(int i=0; i<nums.length-1; i++){
            farthest = Math.max(farthest, nums[i] + i);
            if(current == i){
                current = farthest;
                jumps++;
            }
        }
        return jumps;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
