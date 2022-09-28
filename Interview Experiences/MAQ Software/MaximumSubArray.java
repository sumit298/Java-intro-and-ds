public class MaximumSubArray{
    public static int kadaneAlgo(int arr[]){
        int overallSum = arr[0];
        int currentSum = arr[0];
        for(int i=1; i<arr.length; i++){
            if(currentSum > 0){
                currentSum = currentSum + arr[i];

            }
            else{
                currentSum = arr[i];
            }
            if(currentSum > overallSum){
                overallSum = currentSum;
            }
        }
        return overallSum;
    }
    public static void main(String[] args) {
        int[] arr = {3,-2,4,5,-9};
        System.out.println(kadaneAlgo(arr));
    }
}