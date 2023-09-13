package Collections.P101;

import Collections.P101.entities.Dog;
import Collections.P101.services.DogService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> dogsList = new ArrayList<>();
        DogService dogService = new DogService();

        dogService.addDogs(dogsList);
        dogService.showDogs(dogsList);
        dogService.searchDog(dogsList);
        dogService.sortDogList(dogsList);
        dogService.showDogs(dogsList);
    }
}
