package FractionClass;

public class Fraction {
    private int neumerator;
    private int denominator;

    Fraction(int neumerator, int denominator) throws DivideByZeroException {
        this.neumerator = neumerator;
        if (denominator == 0) {
            DivideByZeroException e = new DivideByZeroException();
            throw e;
        }
        this.denominator = denominator;
        simplify();
    }

    void print() {
        // simplify();
        System.out.println(neumerator + "/" + denominator);
    }

    void simplify() {
        int gcd = 1;
        int smaller = Math.min(neumerator, denominator);
        for (int i = 2; i <= smaller; i++) {
            if (neumerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }
        neumerator = neumerator / gcd;
        denominator = denominator / gcd;
    }

    // Getter and Setters
    int getNumerator() {
        return neumerator;

    }

    void setNumerator(int neumerator) {
        this.neumerator = neumerator;
        simplify();
    }

    void setDenominator(int denominator) throws DivideByZeroException {
        if (denominator == 0) {
            DivideByZeroException e = new DivideByZeroException();
            throw e;
        }
        this.denominator = denominator;
        simplify();
    }

    int getDenominator() {
        return denominator;
    }

    // Static Function
    static Fraction add(Fraction f1, Fraction f2) throws DivideByZeroException {
        int newNumerator = f1.neumerator * f2.denominator + f1.denominator * f2.neumerator;
        int newDenominator = f1.denominator * f2.denominator;
        Fraction f = new Fraction(newNumerator, newDenominator);
        return f;
    }

    void add(Fraction f2) {
        this.neumerator = (this.neumerator * f2.denominator) + (f2.neumerator * this.denominator);
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    void multiply(Fraction f2) {
        this.neumerator = this.neumerator * f2.neumerator;
        this.denominator = this.denominator * f2.denominator;
        simplify();
    }

    void subtract(Fraction f2) {
        this.neumerator = (this.neumerator * f2.denominator) - (f2.neumerator * this.denominator);
        this.denominator = this.denominator * f2.denominator;
        simplify();
        // learn gcd of negative numbers
    }
}
