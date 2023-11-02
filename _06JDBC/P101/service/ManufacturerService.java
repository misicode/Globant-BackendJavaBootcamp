package org.amincia._06JDBC.P101.service;

import org.amincia._06JDBC.P101.model.Manufacturer;
import org.amincia._06JDBC.P101.repository.ManufacturerRepositoryImpl;
import org.amincia._06JDBC.P101.repository.Repository;

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
