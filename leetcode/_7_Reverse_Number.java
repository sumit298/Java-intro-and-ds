public class _7_Reverse_Number {
    public static int reverseInt(int x) {
        int remainder;
        int reverse = 0;
        while (x != 0) {
            remainder = x % 10;
            x = x / 10;
            if (reverse > Integer.MAX_VALUE || reverse == Integer.MAX_VALUE && remainder > 7) {
                return 0;
            }
            if (reverse < Integer.MIN_VALUE || reverse == Integer.MIN_VALUE && remainder < -8) {
                return 0;
            }
            reverse = (reverse * 10) + remainder;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int n = -124;
        System.out.println(reverseInt(n));
    }
}
