package org.amincia._04Relationships.Exercises.P203;

import org.amincia._04Relationships.Exercises.P203.services.PolicyService;
import org.amincia._04Relationships.Exercises.P203.entities.Policy;

public class Main {
    public static void main(String[] args) {
        PolicyService policyService = new PolicyService();
        Policy policy = policyService.createPolicy();

        policyService.viewPolicy(policy);
    }
}
