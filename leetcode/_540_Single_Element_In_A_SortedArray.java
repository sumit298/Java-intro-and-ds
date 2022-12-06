import java.util.HashMap;

public class _540_Single_Element_In_A_SortedArray {
    public static int singleNonDuplicate(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i]) == 1){
                return arr[i];
            }
        }
        return -1;
    }
    // time complexity: O(n)
    // space complexity: O(n)
    // Approach 2: Binary Search
    public static int singleNonDuplicate2(int arr[]){
        int low = 0;
        int high = arr.length-1;
        return low+high;
        
    }
}
