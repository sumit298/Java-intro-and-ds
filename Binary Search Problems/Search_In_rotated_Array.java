public class Search_In_rotated_Array {
    public static int searchRotatedArray(int nums[], int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            // for checking left part of the array is sorted or not.
            else if (nums[low] <= nums[mid]) {
                // if true it is sorted.
                // to find if the target is in the left part or not
                if (target <= nums[mid] && target >= nums[low]) {
                    // then it is in the left part
                    high = mid - 1;
                } else {
                    // it is in the other part
                    low = mid + 1;
                }

            }
            // to check whether the right side is sorted or not.
            else if (nums[high] >= nums[mid]) {
                // if true it is sorted
                // to check if target lies in the right half
                if (target > nums[mid] && target < nums[high]) {
                    // then it is in the right side
                    low = mid + 1;
                } else {
                    // it is the other side
                    high = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 8, 10, 12, 16, 18, 3, 5, 6 };
        int index = searchRotatedArray(nums, 5);
        System.out.println(index);
    }
}

// So, there can be another solution which is also easy to understand, and a bit
// less lengthier than the one explained by him.
// Lemme first give the intuition of this solution,
// for any given index or point in a rotated sorted array, there exists one
// sorted sub-array and one unsorted sub-array, for eg:-
// arr[]: 8 10 12 16 18 3 5 6
// at index =2,val=12, 8 10 is the sorted one
// 12 16 18 3 5 6 is the unsorted one
// at index =6, val=5, 8 10 12 16 18 3 is the unsorted one
// 5 6 is the sorted one

// So, what we can do is we can just normally find the middle element for a
// rotated sorted array, and from this middle point one part will be sorted ,
// one will be unsorted,
// -> So, how can i check if my 1st sub-array is sorted, just check if first
// element is less than middle element or not, if it is , then the 1st part is
// sorted, now knowing this part is sorted , how can I check if my target
// element exists in this part or not.
// just check that the target element is greater than the first element and less
// than the middle element, if this is true, then there's a possibility that the
// target element lies here, just have to perform normal binary search here.. If
// it doesn't lie here, then we're sure enough that we don't have to traverse
// this sorted part (first=mid+1), we can skip this whole part(just like normal
// binary search), and traverse in the unsorted part.

// ->secondly, how can I check if my second part is sorted or not , just check ,
// is your middle element less than the last element or not. If it's true, your
// second part is sorted.
// Now, how can I check if my target lies in this 2nd part(which is now the
// sorted one), just check if target is greater than middle and less than last
// or not. If it's true , then the target can lie here, just have to perform
// normal binary search here.
// If it's not true, eliminate this whole sorted array, (by doing last=mid-1),
// and traverse in the unsorted part.

// So, basically, I'm just a picking a point(obviously the middle element) , and
// dividing my array into two parts , one is sorted ,and the other one is
// unsorted , checking if my target lies in the sorted part by applying
// conditions, if it's there, performing normal binary search, and if it's not
// there then just skipping this whole sorted part, and moving towards the
// unsorted part.
// In the unsorted part , again I'm dividing the array into two parts and doing
// the same.
