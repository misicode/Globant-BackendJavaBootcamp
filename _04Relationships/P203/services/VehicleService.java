package _04Relationships.P203.services;

import _04Relationships.P203.entities.Vehicle;

public class VehicleService {
    public Vehicle createVehicle() {
        Vehicle vehicle = new Vehicle();

        vehicle.setBrand("Suzuki");
        vehicle.setModel("Swift Hybrid");
        vehicle.setYear(2023);
        vehicle.setEngineNum(4);
        vehicle.setChassis("Híbrido");
        vehicle.setColor("Azul eléctrico");
        vehicle.setType("Camioneta");

        return vehicle;
    }
}
