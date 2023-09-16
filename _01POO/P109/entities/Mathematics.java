package _01POO.P109.entities;

public class Mathematics {
    private double number1;
    private double number2;
    private double numMax;
    private double numMin;

    public Mathematics() {}

    public Mathematics(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
        this.numMax = Math.max(number1, number2);
        this.numMin = Math.min(number1, number2);
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getNumMax() {
        return numMax;
    }

    public void setNumMax(double number1, double number2) {
        this.numMax = Math.max(number1, number2);
    }

    public double getNumMin() {
        return numMin;
    }

    public void setNumMin(double number1, double number2) {
        this.numMin = Math.min(number1, number2);
    }

    @Override
    public String toString() {
        return "MATEMÁTICAS:" +
                "\nNúmero 1: " + number1 +
                "\nNúmero 2: " + number2;
    }
}
