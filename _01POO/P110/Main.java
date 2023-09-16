package _01POO.P110;

import _01POO.P110.entities.OrderArrays;
import _01POO.P110.services.OrderArraysService;

public class Main {
    public static void main(String[] args) {
        OrderArraysService orderArraysService = new OrderArraysService();
        OrderArrays orderArrays = orderArraysService.createOrderArrays();

        System.out.println(orderArrays);
    }
}
