public class Problem16 {
    public static void main(String[] args) {
        Integer iOb = new Integer(100);
        double i = (double) iOb.intValue();
        System.out.println(i + iOb);
    }
}

// Integer() = Constructs a newly allocated Integer object that represents the
// specified int value.
// intValue() = Returns the value of this Integer as an int.
// 100 + 100.0
// 200.0
