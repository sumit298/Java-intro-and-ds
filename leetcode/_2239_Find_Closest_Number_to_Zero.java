import java.util.Arrays;

public class _2239_Find_Closest_Number_to_Zero {
    public int findClosestNum(int nums[]){
        int result = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (Math.abs(nums[i]) < Math.abs(result) || Math.abs(nums[i]) == Math.abs(result) && nums[i] > result) {
				result = nums[i];
			}
		}
		return result;
    }
    public int myApproach(int arr[]){
        int negCount =0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<0){
                negCount++;
            }
        
        }
        if (negCount == arr.length){
            return arr[0];
        }
      int result[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i] <0){
              result[i]  =  Math.abs(arr[i]);
            }
            else{
                result[i] = arr[i];
            }
        }
        Arrays.sort(result);
        return result[0];
    }
    
}
