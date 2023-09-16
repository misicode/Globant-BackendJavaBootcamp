package _01POO.P114;

import _01POO.P114.entities.Mobile;
import _01POO.P114.services.MobileService;

public class Main {
    public static void main(String[] args) {
        MobileService mobileService = new MobileService();
        Mobile mobile = mobileService.createMobile();

        System.out.println(mobile);
    }
}
