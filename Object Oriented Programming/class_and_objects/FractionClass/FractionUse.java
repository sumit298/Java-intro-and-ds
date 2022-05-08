package FractionClass;

public class FractionUse {
    public static void main(String[] args) {
        try {
            Fraction f1 = new Fraction(10, 5);
            f1.print();
            Fraction f2 = new Fraction(3, 4);
            f1.subtract(f2);
            f1.print();
            f1.add(f2);
            f1.print();
            f1.multiply(f2);
            f1.print();
            Fraction f4 = Fraction.add(f1, f2);
            f4.print();

        } catch (DivideByZeroException e) {
            System.out.println("Denominator can't be zero " + e);
            
        }

    }
}
