package _04Relationships.P203.services;

import _04Relationships.P203.entities.Fee;
import _04Relationships.P203.entities.Policy;

import java.util.ArrayList;
import java.util.Calendar;

public class PolicyService {
    public Policy createPolicy() {
        CustomerService customerService = new CustomerService();
        VehicleService vehicleService = new VehicleService();
        Policy policy = new Policy();

        Calendar startDate = Calendar.getInstance();
        startDate.set(2023, Calendar.FEBRUARY, 10);
        Calendar endDate = Calendar.getInstance();
        endDate.set(2024, Calendar.MAY, 10);
        int numFees = endDate.get(Calendar.MONTH) - startDate.get(Calendar.MONTH);

        policy.setPolicyNum(1);
        policy.setVehicle(vehicleService.createVehicle());
        policy.setCustomer(customerService.createCustomer());
        policy.setStartDate(startDate);
        policy.setEndDate(endDate);
        policy.setNumFees(numFees);
        policy.setFees(generateFees(numFees));
        policy.setMethodPayment("Transferencia");
        policy.setAmountPolicy(25000);
        policy.setHasHail(true);
        policy.setAmountHail(500);
        policy.setTypeCoverage("Total");

        return policy;
    }

    private ArrayList<Fee> generateFees(int numFees) {
        ArrayList<Fee> fees = new ArrayList<>();

        for(int i = 0; i < numFees; i++) {
            Calendar dueDate = Calendar.getInstance();
            dueDate.set(2023, i + 2, 10);

            Fee fee = new Fee();
            fee.setFeeNum(i+1);
            fee.setAmountFee(500);
            fee.setPaid(false);
            fee.setDueDate(dueDate);
            fee.setMethodPayment("Transferencia");

            fees.add(fee);
        }

        return fees;
    }

    public void viewPolicy(Policy policy) {
        System.out.println(policy.getCustomer());
        System.out.println("\n" + policy.getVehicle());
        System.out.println("\n" + policy);
        for(Fee fee: policy.getFees()) {
            System.out.println("\n" + fee);
        }
    }
}
