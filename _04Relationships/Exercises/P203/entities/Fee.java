package org.amincia._04Relationships.Exercises.P203.entities;

import java.util.Calendar;

public class Fee {
    private int feeNum;
    private double amountFee;
    private boolean isPaid;
    private Calendar dueDate;
    private String methodPayment;

    public Fee() {}

    public Fee(int feeNum, double amountFee, boolean isPaid, Calendar dueDate, String methodPayment) {
        this.feeNum = feeNum;
        this.amountFee = amountFee;
        this.isPaid = isPaid;
        this.dueDate = dueDate;
        this.methodPayment = methodPayment;
    }

    public void setFeeNum(int feeNum) {
        this.feeNum = feeNum;
    }

    public void setAmountFee(double amountFee) {
        this.amountFee = amountFee;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

    public void setMethodPayment(String methodPayment) {
        this.methodPayment = methodPayment;
    }

    @Override
    public String toString() {
        return "CUOTA:" +
                "\nNúmero: " + feeNum +
                "\nMonto de la cuota: " + amountFee +
                "\nEstá pagada?: " + isPaid +
                "\nFecha de vencimiento: " + dueDate.getTime() +
                "\nForma de pago: " + methodPayment;
    }
}
