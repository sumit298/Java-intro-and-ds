public class _367_Valid_Perfect_Square {
    // Given a
    // positive integer num,
    // write a
    // function which
    // returns True if
    // num is
    // a perfect square else
    // False.

    // Follow up:
    // Do not
    // use any built-
    // in library
    // function such
    // as sqrt.

    // Example 1:

    // Input:num=16 Output:true Example 2:

    // Input:num=14 Output:false

    public static boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) {
            return true;
        }
        for (int i = 0; i < num / 2; i++) {
            int x = i * i;
            if (x == num) {
                return true;
            } else if (num < x) {
                return false;
            } 
        }
        return false;
    }

    public static boolean isPerfectSquare2(int num) {
        int unit_digit = num % 10;
        if (unit_digit == 2 || unit_digit == 3 || unit_digit == 7 || unit_digit == 8) {
            return false;

        }
        for (int i = 0; i < num / 2 + 1; i++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPerfectSquare3(int num) {
        for (int i = 1; i * i <= num; i++) {
            if ((num % i == 0) && (num / i == i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }
}
