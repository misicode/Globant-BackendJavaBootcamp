package org.amincia._04Relationships.P203;

import org.amincia._04Relationships.P203.entities.Policy;
import org.amincia._04Relationships.P203.services.PolicyService;

public class Main {
    public static void main(String[] args) {
        PolicyService policyService = new PolicyService();
        Policy policy = policyService.createPolicy();

        policyService.viewPolicy(policy);
    }
}
