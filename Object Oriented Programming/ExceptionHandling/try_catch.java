import java.util.Scanner;

public class try_catch {
    public static int[] takeInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = takeInput();
        try {
            printArray(arr);
            System.out.println();
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println();
            System.out.println("Exception thrown :" + exception);
            System.out.println("You can't be accessing index greater than its sizes");
        } finally {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }
}
