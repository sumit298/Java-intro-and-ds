import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _442_Find_Duplicates_In_Array {
    // constraints: 0<arr[i]<arr.length
    // T.C: O(n)
    // S.C: O(1)
    public static List<Integer> findDuplicates(int arr[]) {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            // find the absolute value
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                output.add(index + 1);
            }
            arr[index] = -arr[index];

        }
        return output;
    }
    public static List<Integer> findDuplicatesHashMap(int arr[]){
        HashMap<Integer, Integer> countMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(countMap.containsKey(arr[i])){
                countMap.put(arr[i], countMap.get(arr[i])+1);
            }
            else {
                countMap.put(arr[i], 1);
            }

            if(countMap.values().contains(2)){
                result.add(arr[i]);
            }
        }
        System.out.println(countMap);
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 2, 4 };
        List<Integer> output = findDuplicatesHashMap(arr);
        System.out.println(output);
    }
}
