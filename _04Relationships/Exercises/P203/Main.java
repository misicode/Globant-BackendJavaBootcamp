package com.misicode._04Relationships.Exercises.P203;

import com.misicode._04Relationships.Exercises.P203.entities.Policy;
import com.misicode._04Relationships.Exercises.P203.services.PolicyService;

public class Main {
    public static void main(String[] args) {
        PolicyService policyService = new PolicyService();
        Policy policy = policyService.createPolicy();

        policyService.viewPolicy(policy);
    }
}
