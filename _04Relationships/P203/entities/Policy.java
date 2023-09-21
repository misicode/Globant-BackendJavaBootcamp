package _04Relationships.P203.entities;

import java.util.ArrayList;
import java.util.Calendar;

public class Policy {
    private int policyNum;
    private Vehicle vehicle;
    private Customer customer;
    private Calendar startDate;
    private Calendar endDate;
    private int numFees;
    private ArrayList<Fee> fees;
    private String methodPayment;
    private double amountPolicy;
    private boolean hasHail;
    private double amountHail;
    private String typeCoverage;

    public void setPolicyNum(int policyNum) {
        this.policyNum = policyNum;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public void setNumFees(int numFees) {
        this.numFees = numFees;
    }

    public void setFees(ArrayList<Fee> fees) {
        this.fees = fees;
    }

    public void setMethodPayment(String methodPayment) {
        this.methodPayment = methodPayment;
    }

    public void setAmountPolicy(double amountPolicy) {
        this.amountPolicy = amountPolicy;
    }

    public ArrayList<Fee> getFees() {
        return fees;
    }

    public void setHasHail(boolean hasHail) {
        this.hasHail = hasHail;
    }

    public void setAmountHail(double amountHail) {
        this.amountHail = amountHail;
    }

    public void setTypeCoverage(String typeCoverage) {
        this.typeCoverage = typeCoverage;
    }

    @Override
    public String toString() {
        return "POLIZA:" +
                "\nNúmero: " + policyNum +
                "\nFecha de inicio: " + startDate.getTime() +
                "\nFecha de fin: " + endDate.getTime() +
                "\nCantidad de cuotas: " + numFees +
                "\nForma de pago: " + methodPayment +
                "\nMonto total asegurado: " + amountPolicy +
                "\nIncluye granizo?: " + hasHail +
                "\nMonto máximo granizo: " + amountHail +
                "\nTipo de cobertura: " + typeCoverage;
    }
}
