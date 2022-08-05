public class _1470_Shuffle_The_Array {
    public int[] shuffle2(int[] nums, int n) {
        int[] res = new int[nums.length];
        for(int i=0; i<n; i++){
            res[i*2] = nums[i];
            res[i*2+1] = nums[i+n];
        }
        return res;
    }
    public static int[] shuffle(int nums[], int n){
        int result[] = new int[nums.length];
        int i; 
        int j= 0;
        int k = (nums.length / n) + (n- (nums.length/n));
        for( i=0; i<nums.length;i++){
            if(i%2!=0){
                result[i] = nums[k];
                k = k+1;
            }
            else{
                result[i] = nums[j];
                j = j+1;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,5,1,3,4,7};
        int result[] = shuffle(arr, 3);
        for(int i=0; i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}