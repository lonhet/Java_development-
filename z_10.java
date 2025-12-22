class ComplexNumber {

    private double real;      
    private double imaginary; 

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;}

    public double getReal() {
        return real;}

    public void setReal(double real) {
        this.real = real;}

    public double getImaginary() {
        return imaginary;}

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;}

    public ComplexNumber sin() {
        double newReal = Math.sin(real) * Math.cosh(imaginary);
        double newImaginary = Math.cos(real) * Math.sinh(imaginary);
        return new ComplexNumber(newReal, newImaginary);}

    @Override
    public String toString() {
        return String.format("%.4f %s %.4fi",
                real,
                imaginary >= 0 ? "+" : "-",
                Math.abs(imaginary));}
}

public class Main {

    public static void main(String[] args) {
        ComplexNumber z = new ComplexNumber(1.0, 0.5);

        System.out.println("Исходное число z = " + z);
        ComplexNumber sinZ = z.sin();

        System.out.println("sin(z) = " + sinZ);}
}
