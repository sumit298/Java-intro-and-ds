public class ReverseArray {
    // By swapping
    public static int[] reverse(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    public static void reversePrint(int arr[]) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void reverseRecursive(int arr[], int left, int right) {
        // same logic as above but we are incrementing the pointer in recursive call
        if (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            reverseRecursive(arr, ++left, --right);
        }
    }

    public static void reverseRecursiveCall(int arr[]) {
        reverseRecursive(arr, 0, arr.length - 1);
    }

    // public static int[] reverseByTempArray(int arr[]){
    //     int temp[] = new int[arr.length];

    // }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        // int newArr[] = reverse(arr);
        reverseRecursiveCall(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
