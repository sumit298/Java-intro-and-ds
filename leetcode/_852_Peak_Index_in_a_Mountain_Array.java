public class _852_Peak_Index_in_a_Mountain_Array {
    // Let's call an array arr a mountain if the following properties hold:

    // arr.length >= 3
    // There exists some i with 0 < i < arr.length - 1 such that:
    // arr[0] < arr[1] < ... arr[i-1] < arr[i]
    // arr[i] > arr[i+1] > ... > arr[arr.length - 1]
    // Given an integer array arr that is guaranteed to be a mountain, return any i
    // such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... >
    // arr[arr.length - 1].

    // Example 1:

    // Input: arr = [0,1,0]
    // Output: 1
    // Example 2:

    // Input: arr = [0,2,1,0]
    // Output: 1
    // Example 3:

    // Input: arr = [0,10,5,2]
    // Output: 1

    // Constraints:

    // 3 <= arr.length <= 104
    // 0 <= arr[i] <= 106
    // arr is guaranteed to be a mountain array.

    // Follow up: Finding the O(n) is straightforward, could you find an O(log(n))
    // solution?
    public static int peakIndex(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int midpoint = start + (end-start)/2;
            if(arr[midpoint] > arr[midpoint+1]){
                end = midpoint;
            }
            else{
                start = midpoint+1;
            }
        }
        return start; // at last, start and end will point to same index.
    }


    public static void main(String[] args) {
        int arr[] = {0,2,10,14};
        System.out.println(peakIndex(arr));
    }

    // Approaches: o(n) find maximum element and return its index;
    // o(logn): do binary search if(arr[mid]> arr[midpoint+1]) end  = mid you found your peak.
    // else start = midpoint + 1 at last return end or start.
}
