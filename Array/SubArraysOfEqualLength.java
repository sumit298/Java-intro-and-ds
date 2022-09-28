import java.util.ArrayList;
import java.util.HashSet;

public class SubArraysOfEqualLength {
    // Given a 0-indexed integer array nums, determine whether there exist two
    // subarrays of length 2 with equal sum. Note that the two subarrays must begin
    // at different indices.

    // Return true if these subarrays exist, and false otherwise.
    public static boolean subArrayEqual(int arr[]) {
        if (arr.length < 3) {
            return false;
        }
        int end = arr.length - 1;
        int start = 0;
        int startSum = 0;
        int endSum = 0;

        while (start < end-1) {
            startSum = arr[start] + arr[start + 1];
            endSum = arr[end] + arr[end - 1];
            if (startSum == endSum) {
                return true;
            }
            start++;
            end--;
        }

        return false;
    }

    public static boolean SubArraysOfEqualLengthHashSet(int nums[]){
        if(nums.length<2)
        return false;
        
        HashSet<Integer> set=new HashSet<>(); //  To Track previous sum calculated 
        
        for(int i=0;i<nums.length-1;i++){
            
            if(!set.add(nums[i]+nums[i+1]))  //   Check if sum already exist 
            return true;
            
        }
        
        return false;    
    }

    public boolean findSubarrays(int[] nums) 
    {
        int[] ans = new int[nums.length - 1];
        
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length-1; i++){
            if (res.contains(nums[i] + nums[i+1])){
                return true;
            }
            else {
                res.add(nums[i] + nums[i+1]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 99,24,64,34,45,53,98,57,7,72,13,8,61,52,34,99,93,43,71,18,44,30,12,75,64,97,46,1,87,17,16,91,69,47,18,7,21,33,94,52 };
        System.out.println(SubArraysOfEqualLengthHashSet(arr));
       
    }
}
