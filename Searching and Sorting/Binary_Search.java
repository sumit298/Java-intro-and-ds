import java.util.Scanner;

public class Binary_Search {
    public static int[] takeInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static int binarySearch(int nums[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the target you want to find: ");
        int target = scan.nextInt();
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;

            } else if (target >= nums[mid]) {
                low = mid + 1;
            } else if (target <= nums[mid]) {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = takeInput();
        int key = binarySearch(arr);
        if (key == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + key);
        }

    }
}
