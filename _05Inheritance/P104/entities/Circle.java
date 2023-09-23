package _05Inheritance.P104.entities;

public class Circle implements Shape {
    private double radio;

    public Circle() {}

    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(this.radio, 2);
    }

    @Override
    public double calculatePerimeter() {
        return PI * 2 * this.radio;
    }
}
