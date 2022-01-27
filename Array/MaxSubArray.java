public class MaxSubArray {
    public static int MaxSubArrayByKadaneAlgo(int arr[]) {
        int currentSum = arr[0];
        int overallSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (currentSum > 0) {
                currentSum += arr[i];
            } else {
                currentSum = arr[i];
            }
            if (currentSum > overallSum) {
                overallSum = currentSum;
            }

        }
        return overallSum;
    }

    public static void main(String[] args) {
        // int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int arr[] = ArrayUse.arrInput();
        System.out.println("Maximum Subarray is " + MaxSubArrayByKadaneAlgo(arr));

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