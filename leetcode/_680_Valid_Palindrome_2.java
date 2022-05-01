public class _680_Valid_Palindrome_2 {
    // Given a string s, return true if the s can be palindrome after deleting at
    // most one character from it.

    // Example 1:

    // Input: s = "aba"
    // Output: true
    // Example 2:

    // Input: s = "abca"
    // Output: true
    // Explanation: You could delete the character 'c'.
    // Example 3:

    // Input: s = "abc"
    // Output: false

    public static boolean validPalindrome(String s) {
        int left_pointer = 0;
        int right_pointer = s.length() - 1;
        while (left_pointer <= right_pointer) {
            if (s.charAt(left_pointer) != s.charAt(right_pointer)) {
                return subStringHelper(s, left_pointer + 1, right_pointer)
                        || subStringHelper(s, left_pointer, right_pointer - 1);
            }
            left_pointer++;
            right_pointer--;
        }
        return true;

    }

    private static boolean subStringHelper(String s, int start, int end) {
        int left_pointer = start;
        int right_pointer = end;
        while (left_pointer <= right_pointer) {
            if (s.charAt(left_pointer) != s.charAt(right_pointer)) {
                return false;
            }
            left_pointer++;
            right_pointer--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }
}
