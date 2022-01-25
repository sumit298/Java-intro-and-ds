class Shape {
    int height;
    int width;
}

public class Prob1 {
    public static void main(String[] args) {
        Shape s = new Shape();
        s.height = 5;
        System.out.println(s.height);
    }
}

// Since height is a default data member of class Shape and Problem1
// both the classes are in same package. So we can access height via shape
// object in Problem1 class.
