// Print the sum, difference and product of two complex numbers by creating a class
// named 'Complex' with separate methods for each operation whose real and imaginary
// parts are entered by the user

package PracticeSheets.OOPs_11;

public class Complex{
    float real;
    float imaginary;

    Complex(double real, double imaginary){
        this.real = (float)real;
        this.imaginary = (float)imaginary;
        System.out.println(this.real + " + " + this.imaginary + "i");
    }

    static void sum(Complex c1, Complex c2){
        float r = c1.real + c2.real;
        float i = c1.imaginary + c2.imaginary;
        System.out.println("sum = " + r + " + " + i + "i");
    }

    static void difference(Complex c1, Complex c2){
        float r = c1.real - c2.real;
        float i = c1.imaginary - c2.imaginary;
        System.out.println("diff = " + r + " + " + i + "i");
    }

    static void product(Complex c1, Complex c2){
        float r = c1.real*c2.real + c1.imaginary*c2.imaginary;
        float i = c1.real*c2.imaginary + c1.imaginary*c2.real;
        System.out.println("prod = " + r + " + " + i + "i");
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(1.4, 8.9);
        Complex c2 = new Complex(5.6, 2.3);

        sum(c1,c2);
        difference(c1, c2);
        product(c1, c2);
    }
}