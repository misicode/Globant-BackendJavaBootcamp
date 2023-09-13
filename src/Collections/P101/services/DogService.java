package Collections.P101.services;

import Collections.P101.entities.Dog;

import java.util.*;

public class DogService {
    static Scanner scanner = new Scanner(System.in);

    public Dog createDog() {
        Dog dog = new Dog();

        System.out.print("Ingrese la raza del perro: ");
        dog.setBreed(scanner.nextLine());

        return dog;
    }

    public void addDogs(ArrayList<Dog> dogsList) {
        String resp;

        do {
            dogsList.add(createDog());
            System.out.print("Desea agregar otro perro a la lista (Y-N)? ");
            resp = scanner.nextLine().toUpperCase();
        } while(resp.equals("Y"));
    }

    public void showDogs(ArrayList<Dog> dogsList) {
        System.out.println("\nLISTA DE PERROS:");
        for(Dog dog: dogsList) {
            System.out.println(dog);
        }
    }

    public void searchDog(ArrayList<Dog> dogsList) {
        Iterator<Dog> iterator = dogsList.iterator();

        System.out.print("\nIngrese la raza de perro a buscar: ");
        String breed = scanner.nextLine();

        while(iterator.hasNext()) {
            if(iterator.next().getBreed().equals(breed)) {
                System.out.println("Se eliminó el perro de raza " + breed);
                iterator.remove();
                return;
            }
        }

        System.out.println("No se encontró un perro con esa raza en la lista");
    }

    public void sortDogList(ArrayList<Dog> dogsList) {
        dogsList.sort(new Dog());
    }
}
