import java.util.Arrays;
import java.util.Scanner;

public class Triple {
    // Given an array a of n elements, print any value that appears at least three
    // times or print -1 if there is no such value.

    // Input
    // The first line contains an integer t (1≤t≤104) — the number of test cases.

    // The first line of each test case contains an integer n (1≤n≤2⋅105) — the
    // length of the array.

    // The second line of each test case contains n integers a1,a2,…,an (1≤ai≤n) —
    // the elements of the array.

    // It is guaranteed that the sum of n over all test cases does not exceed 2⋅105.

    // Output
    // For each test case, print any value that appears at least three times or
    // print -1 if there is no such value.

    // Example
    // inputCopy
    // 7
    // 1
    // 1
    // 3
    // 2 2 2
    // 7
    // 2 2 3 3 4 2 2
    // 8
    // 1 4 3 4 3 2 4 1
    // 9
    // 1 1 1 2 2 2 3 3 3
    // 5
    // 1 5 2 4 3
    // 4
    // 4 4 4 4
    // outputCopy
    // -1
    // 2
    // 2
    // 4
    // 3
    // -1
    // 4
    // Note
    // In the first test case there is just a single element, so it can't occur at
    // least three times and the answer is -1.

    // In the second test case, all three elements of the array are equal to 2, so 2
    // occurs three times, and so the answer is 2.

    // For the third test case, 2 occurs four times, so the answer is 2.

    // For the fourth test case, 4 occurs three times, so the answer is 4.

    // For the fifth test case, 1, 2 and 3 all occur at least three times, so they
    // are all valid outputs.

    // For the sixth test case, all elements are distinct, so none of them occurs at
    // least three times and the answer is -1.
    public static int countOccurence(int arr[]) {
        Arrays.sort(arr);
        int count = 0;
        int value = 0;
        if (arr.length < 3) {
            return -1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
                value = arr[i];
            }
        }
        if (count > 0) {
            return value;
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int length = scan.nextInt();
            int arr[] = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = scan.nextInt();
            }
            int result = countOccurence(arr);
            if (result == -1) {
                System.out.println("-1");
            }
            else{
                System.out.println(result);
            }
        }
    }
}
