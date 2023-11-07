package com.misicode._01POO.Exercises.P114;

import com.misicode._01POO.Exercises.P114.entities.Mobile;
import com.misicode._01POO.Exercises.P114.services.MobileService;

public class Main {
    public static void main(String[] args) {
        MobileService mobileService = new MobileService();
        Mobile mobile = mobileService.createMobile();

        System.out.println(mobile);
    }
}
