public class Insert_Search_Position {
    public static int insertSearch(int arr[], int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid;
            }

        }
        return low;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6 };
        int ans = insertSearch(arr, 7);
        System.out.println(ans);
    }
}
