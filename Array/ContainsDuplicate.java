import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean containDuplicate(int arr[]) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[] = ArrayUse.arrInput();
        boolean result = containDuplicate(arr);
        System.out.println(result);
    }
}
