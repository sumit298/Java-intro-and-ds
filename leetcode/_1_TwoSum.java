import java.util.HashMap;
public class _1_TwoSum {
    // Approach 1: Brute Force
    public static int[] PairSumOfArray(int arr[], int target) {
        int result[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    // Time Complexity: O(n^2)
    public static int[] pairSumHashMap(int arr[], int target){
        HashMap<Integer, Integer> h1 = new HashMap<>();
        int i=0;
        for(int val: arr){
            if(h1.containsKey(target-val)){
                return new int[]{i, h1.get(target-val)};
            }
            h1.put(val, i);
            i++;

        }
        return new int[]{-1,-1};
    }
    // optimal solution remaining
    public static int[] twoSumOptimal(int arr[], int target){
        int result[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int difference = target - arr[i];
            if(map.containsKey(difference)){
                result[0] = i;
                result[1] = map.get(difference);
            }
            else{
                map.put(arr[i], i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {2,45,6,7,4};
        int result[] =twoSumOptimal(arr, 11);
        System.out.print(result[0] + " " + result[1]);
    }
}
