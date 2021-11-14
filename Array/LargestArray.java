public class LargestArray {

    public static int LargestArrayElement(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
    // Logic Behind Largest Array
    // For that we are defining a variable max and initializing it with Integer.MIN_VALUE.
    // Then we are iterating through the array and checking if the element at index i is greater than max.
    // If it is greater than max, then we are assigning max to the element at index i.
    // Finally we are returning max.
    
    public static void main(String[] args) {
        int arr[] = ArrayUse.arrInput();
        int largestElement = LargestArrayElement(arr);
        System.out.println(largestElement);
    }
}
