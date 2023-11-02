package org.amincia._01POO.P105.entities;

public class Account {
    private int accountNumber;
    private long dniCustomer;
    private double currentBalance;

    public Account() {}

    public Account(int accountNumber, long dniCustomer, double currentBalance) {
        this.accountNumber = accountNumber;
        this.dniCustomer = dniCustomer;
        this.currentBalance = currentBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getDniCustomer() {
        return dniCustomer;
    }

    public void setDniCustomer(long dniCustomer) {
        this.dniCustomer = dniCustomer;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "CUENTA:" +
                "\nNúmero de cuenta: " + accountNumber +
                "\nDNI: " + dniCustomer +
                "\nSaldo actual: " + currentBalance;
    }
}
