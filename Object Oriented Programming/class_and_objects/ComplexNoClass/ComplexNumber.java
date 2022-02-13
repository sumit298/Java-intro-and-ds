package ComplexNoClass;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void print() {
        System.out.println(real + " + " + imaginary + "i");
    }

    // getter and setters
    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    void add(ComplexNumber c2) {
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }

    void multiply(ComplexNumber c2) {
        this.real = this.real * c2.real;
        this.imaginary = this.imaginary * c2.imaginary;
    }

    static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        int newReal = c1.real + c2.real;
        int newImaginary = c1.imaginary + c2.imaginary;
        ComplexNumber c = new ComplexNumber(newReal, newImaginary);
        return c;
    }

    // public ComplexNumber conjugate(){
    // }
}
