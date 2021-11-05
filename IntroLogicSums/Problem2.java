public class Problem2 {
    public static void main(String[] args) {
        int x = 1;
        int y = x % x * x / x;
        System.out.println(x + " " +  y);
    }
}

// Logic behind Problem
// operator precedence in java - ^, *, /, %, +, -
// x = x*x then / x then % x = 1
// y = 0;
