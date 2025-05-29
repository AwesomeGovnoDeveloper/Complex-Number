package org.example;

public final class Complex {
    private double real;
    private double imaginary;

    public Complex() {

    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public double getAbs() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }
    public double getAngle() {
        return Math.atan(imaginary / real);
    }
    public Complex add(Complex other) {
        return new Complex(real + other.getReal(), imaginary + other.getImaginary());
    }
    public Complex subtract(Complex other) {
        return new Complex(real - other.getReal(), imaginary - other.getImaginary());
    }
    public String toStringCartesian() {
        return (imaginary < 0) ? (real + "" + imaginary + "i") : (real + "+" + imaginary + "i");
    }
    public String toStringExponential() {
        return (getAbs() + "e^" + getAngle()/Math.PI + "πi");
    }

}