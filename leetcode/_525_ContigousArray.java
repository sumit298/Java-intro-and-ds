import java.util.HashMap;

public class _525_ContigousArray {
    public static int findMaxLength(int arr[]){
        HashMap<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, -1);
        int maxLength = 0;
        int count = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i] == 1){
                count = count + 1;
            }
            else{
                count  = count - 1;
            }

            if(countMap.containsKey(count)){
                maxLength = Math.max(maxLength, i-countMap.get(count));
            }
            else{
                countMap.put(count, i);
            }
        }
        return maxLength;

    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,0,0,1,1};
        System.out.println(findMaxLength(arr));
    }
}
