package cs.csmath.complexnumber;

import java.io.FileNotFoundException;

public class ComplexNumber
{
    private double realPart;
    private double imagPart;


    public ComplexNumber() {
        realPart = 0.0;
        imagPart = 0.0;
    }

    public ComplexNumber(double r, double i)
    {
        this.setRealPart(r);
        this.setImagPart(i);
    }


    public double getImagPart() {
        return imagPart;
    }

    public void setImagPart(double imagPart)
    {
        this.imagPart = imagPart;
    }

    public double getRealPart()
    {
        return realPart;
    }

    public void setRealPart(double realPart)
    {
        this.realPart = realPart;
    }

    public void assertEquals() {

    }

    public void add(ComplexNumber otherCN)
    {

    }

    public void sub(ComplexNumber otherCN)
    {

    }

    public void divide (ComplexNumber otherCN) throws FileNotFoundException
    {
        double a = this.getRealPart();
        double b = this.getImagPart();
        double c = otherCN.getRealPart();
        double d = otherCN.getImagPart();

        double denominator = c*c + d*d;
        if (java.lang.Math.abs(denominator)<0.000001) {
            throw new ArithmeticException();
        }

        this.setRealPart(a / c);
        this.setImagPart(b / d);
    }

    public void mult(ComplexNumber otherCN)
    {
        double newRealPart = this.getRealPart() *otherCN.getRealPart()
                - this.getImagPart()* otherCN.getImagPart();
        double newImagPart = this.getImagPart() * otherCN.getRealPart()
                + this.getRealPart() * otherCN.getImagPart();
        this.setRealPart(newRealPart);
        this.setImagPart(newImagPart);
    }

    public double abs() {
        return 0.0;
    }

    public ComplexNumber conj() {
        return null;
    }

    public static ComplexNumber add(ComplexNumber firstCN, ComplexNumber secondCN) {
        throw new UnsupportedOperationException();

    }


    public void setRealPart() {

    }


    public static void main(String[] args) {
        ComplexNumber cn1 = new ComplexNumber();
        System.out.print("CN1 real: " + cn1.getRealPart() + " imag " + cn1.getImagPart());
        ComplexNumber cn2 = new ComplexNumber();
        cn1.mult(cn2);
    }

}
