public class _2256_Minimum_Average_Difference{
    
    public static int minimumAverageDifference(int nums[]){
        
        
        long sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
        }
        long sumFromStart = 0;
        int index = 0;
        long sumFromEnd = sum;
        long minAverageValue = Integer.MAX_VALUE;   
        for(int i=0; i<nums.length; i++){
            sumFromStart += nums[i];
            sumFromEnd -= nums[i];
            long averageFromStart = sumFromStart/(i+1);
            long averageFromEnd = (i == nums.length-1) ? 0: sumFromEnd / (nums.length-i-1); 
            if(Math.abs(averageFromEnd-averageFromStart) < minAverageValue){
                minAverageValue = Math.abs(averageFromEnd-averageFromStart);
                index = i;
            }

        }
        return index;
    }
}