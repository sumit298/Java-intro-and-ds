import java.util.HashMap;

public class _41_FirstMissingPositive {
    public static int findKthPositive(int arr[]) {
        HashMap<Integer, Boolean> store = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            store.put(i + 1, true);
        }

        for (int i = 0; i < arr.length; i++) {
            if (store.containsKey(arr[i])) {
                store.put(arr[i], false);
            }

        }
        // return that key which has value true
        for (int i = 0; i < arr.length; i++) {
            if (store.get(i + 1)) {
                return i + 1;
            }
        }
        System.out.println(store);

        // if all values are false in the store then return the next true value
        return arr.length + 1;

    }

    public static void main(String[] args) {
        int arr[] = { 1 };
        System.out.println(findKthPositive(arr));
    }
}
