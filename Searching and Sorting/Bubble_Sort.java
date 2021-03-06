import java.util.Scanner;

public class Bubble_Sort {
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

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]) {
        int size = arr.length;
        System.out.println("The sorted array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        for (int n = 10; n < 1000000; n = n* 10) {
            int[] input = new int[n];
            for (int i = 0; i < input.length; i++) {
                input[i] = input.length - i;
            }
            long startTime = System.currentTimeMillis();
            bubbleSort(input);
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken by bubble sort for " + n + " is " + (endTime - startTime));
        }
    }
}
