public class _125_Valid_Palindrome {
    public static boolean isValidPalindrome(String s) {
        String fixedString = "";
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) || Character.isLetter(c)) {
                fixedString += c;
            }
        }
        fixedString = fixedString.toLowerCase();
        int left_pointer = 0;
        int right_pointer = s.length() - 1;
        while (left_pointer <= right_pointer) {
            if (fixedString.charAt(left_pointer) != fixedString.charAt(right_pointer)) {
                return false;
            }
            left_pointer++;
            right_pointer--;
        }
        return true;
    }
}
