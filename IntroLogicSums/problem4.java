public class problem4 {
    static class Exec {
        public static int alter(int y) {
            y *= 10;
            return y;
        }
    }

    public static void main(String[] args) {
        int x = 3;
        System.out.println(x + Exec.alter(x));
    }
}

// Reference Learn about static classes
// static class = class that has static methods
// static methods = methods that are not associated with an object
// static methods can be called without creating an object
// x + Exec.alter(3 * 10) = 33;
