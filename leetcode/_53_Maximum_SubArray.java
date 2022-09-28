public class _53_Maximum_SubArray {
    public static int maxSubArray(int arr[]){
        int maxSum = arr[0];
        int currentSum = arr[0];
        for(int i=1; i<arr.length; i++){
            if(currentSum > 0){
                currentSum = currentSum + arr[i];
            }
            else{
                currentSum = arr[i];
            }
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {3,-2,4,5,-9};
        System.out.println(maxSubArray(arr));
    }
}


// What is kadane Algorithm
// Kadane's algorithm is a simple algorithm for finding the maximum subarray of
// a given array.
// The algorithm can be used to find the maximum sum of a contiguous subarray in
// a given array of integers.
// How to do that
// here is currentSum and Overall Sum at first both point to arr[0]
// if currentSum is greater than 0 then currentSum = currentSum + arr[i]
// if currentSum is less than 0 then currentSum = arr[i]
// if currentSum is greater than Overall Sum then Overall Sum = currentSum
// if Overall Sum is less than 0 then Overall Sum = 0
// if Overall Sum is greater than 0 then Overall Sum = Overall Sum
// Time complexity: O(n)
