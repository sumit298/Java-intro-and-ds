public class passing_numbers {
    public static void n_minus_minus(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        n_minus_minus(n--); // n-- is first passing the number and then subtracting 1 from it.
        // so it passing 5 everytime.
    }

    public static void minus_minus_n(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        minus_minus_n(--n); // --n is first subtracting 1 from the number and then passing it.
    }

    public static void main(String[] args) {
        // n_minus_minus(5); //this will lead to infinite recursion
        minus_minus_n(5);
    }
}
