package _01POO.P203.entities;

public class Root {
    private double a;
    private double b;
    private double c;
    private double discriminate;

    public Root() {}

    public Root(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminate() {
        return discriminate;
    }

    public void setDiscriminate(double discriminate) {
        this.discriminate = discriminate;
    }
}
