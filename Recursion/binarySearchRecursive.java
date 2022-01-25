import java.util.Scanner;

public class binarySearchRecursive {
    public static int[] takeInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scan.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the elements of " + i);
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    static int binarySearch(int arr[], int target, int start, int end) {

        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, end);
        }
        return binarySearch(arr, target, start, mid - 1);

    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 7, 8 };
        int target = 70;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(result);
    }
}
