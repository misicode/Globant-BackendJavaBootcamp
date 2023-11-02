package org.amincia._01POO.P110;

import org.amincia._01POO.P110.entities.OrderArrays;
import org.amincia._01POO.P110.services.OrderArraysService;

public class Main {
    public static void main(String[] args) {
        OrderArraysService orderArraysService = new OrderArraysService();
        OrderArrays orderArrays = orderArraysService.createOrderArrays();

        System.out.println(orderArrays);
    }
}
