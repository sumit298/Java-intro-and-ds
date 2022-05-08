public class SecondLargestElement {
    // Think Yourself about logic not of github copilot
    public static int SecondLargest(int arr[]) {
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    // Logic Behind SecondLargest Element:
    // 1. We will find the second largest element in the array.
    // 2. We will find the largest element in the array.
    // 3. We will compare the largest element with the second largest element.
    // 4. If the largest element is greater than the second largest element, then
    // the second largest element is the largest element.
    // 5. If the largest element is less than the second largest element, then the
    // largest element is the second largest element.
    // 6. If the largest element is equal to the second largest element, then the
    // second largest element is the largest element.
    // 7. return second largest element.

    public static void main(String[] args) {
        int arr[] = { 1, 10 };
        System.out.println(SecondLargest(arr));
    }
}
