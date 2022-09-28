import java.util.Arrays;
import java.util.HashMap;

public class DifferenceOfTwoArrayEqualToTarget {
    public static int[] diffOfTwoArray(int arr1[], int arr2[], int target) {
        int result[] = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], i);
        }
        for (int i = 0; i < arr2.length; i++) {
            int difference = Math.abs(target - arr2[i]);
            if (map.containsKey(difference)) {
                result[0] = map.get(difference);
                result[1] = i;
            } else {
                result[0] = -1;
                result[1] = -1;
            }
        }
        

        return result;

    }

    public static void main(String[] args) {
        int arr1[] = { 3, 4, 10 };
        int arr2[] = { 1, 4, 8 };
        int result[] = diffOfTwoArray(arr1, arr2, 5);
        System.out.println(Arrays.toString(result));
    }
}
