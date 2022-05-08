// You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
// Example 3:

// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].

// Constraints:

// 1 <= digits.length <= 100
// 0 <= digits[i] <= 9
// digits does not contain any leading 0's.

public class _66_Plus_one {
    public static int[] plusOne(int[] digits) {
        int result[];

        int lastElement = digits[digits.length - 1];
        if (lastElement == 9) {
            result = new int[digits.length + 1];
            for (int i = 0; i < result.length - 1; i++) {
                result[i] = digits[i];
                System.out.println(result[i]);
            }
            result[result.length - 1] = 0;
            result[result.length - 2] = 1;

        } else {

            digits[digits.length - 1] = ++lastElement;
            return digits;
        }

        return result;
    }

    public int[] plusOne2(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void main(String[] args) {
        int digits[] = { 9, 1, 2 };
        int sum[] = plusOne(digits);
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }

    }
}
