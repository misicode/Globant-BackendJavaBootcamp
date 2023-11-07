package com.misicode._06JDBC.Exercise.service;

import com.misicode._06JDBC.Exercise.repository.ManufacturerRepositoryImpl;
import com.misicode._06JDBC.Exercise.repository.Repository;
import com.misicode._06JDBC.Exercise.entity.Manufacturer;

import java.util.Scanner;

public class ManufacturerService {
    private final Repository<Manufacturer> repository = new ManufacturerRepositoryImpl();
    Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    public void saveManufacturer(Manufacturer manufacturer) {
        repository.save(manufacturer);
        System.out.println("Se registró/actualizó el fabricante: " + manufacturer.getName());
    }

    public Manufacturer createManufacturer() {
        Manufacturer manufacturer = new Manufacturer();

        System.out.print("Ingrese el nombre del fabricante: ");
        manufacturer.setName(scanner.next());

        return manufacturer;
    }
}
