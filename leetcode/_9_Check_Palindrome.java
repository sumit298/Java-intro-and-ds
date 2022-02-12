public class _9_Check_Palindrome {
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int remainder;
        int number = x;
        if (number < 0) {
            return false;
        }
        while (number != 0) {
            remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        }
        return x == reverse;
    }

    public static void main(String[] args) {
        int num = 1221;
        boolean result = isPalindrome(num);
        System.out.println(result);
    }
}

// Approach:
// If the number is negative, return false, else proceed to #2.
// Store the given number x in a variable number. We are doing it because we
// will perform our operations on number and due to that, it’s value will
// change. We will use x at the end of the program to compare with the reversed
// number.
// Reverse the number (Just like LeetCode #7 - Reverse Integer).
// Return true if the reverse number and given number are equal, false
// otherwise.


// Time Complexity
// Since we are going through the entire number digit by digit, the time complexity should be O(log10n). The reason behind log10 is because we are dealing with integers which are base 10.

// Space Complexity
// We are not using any data structure for interim operations, therefore, the space complexity is O(1).