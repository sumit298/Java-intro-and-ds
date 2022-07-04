import java.util.Arrays;

// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
public class MergeTwoArray {
    public static void merge(int arr1[], int m, int arr2[], int n){
        for(int i=0; i<n;i++){
            arr1[i+m] = arr2[i];
        }
        
        Arrays.sort(arr1);
    }
    public static void main(String[] args) {
        int nums1[] = {1,3,5,0,0,0};
        int nums2[] = {2,4,6};
        merge(nums1, 3, nums2, nums2.length);
        for(int i=0; i<nums1.length;i++){
            System.out.print(nums1[i] + " ");
        }
    }
}
