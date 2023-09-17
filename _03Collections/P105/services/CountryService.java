package _03Collections.P105.services;

import java.util.*;

public class CountryService {
    Scanner scanner = new Scanner(System.in).useDelimiter("\r?\n");

    public String createCountry() {
        System.out.print("Ingrese el nombre del país: ");
        return scanner.next();
    }

    public void addCountries(HashSet<String> countriesSet) {
        String resp;

        do {
            countriesSet.add(createCountry());
            System.out.print("Desea agregar otro país al conjunto (Y-N)? ");
            resp = scanner.next().toUpperCase();
        } while(resp.equals("Y"));
    }

    public void showCountries(HashSet<String> countriesSet) {
        System.out.println("\nLISTA DE PAÍSES:");
        for(String country: countriesSet) {
            System.out.println(country);
        }
    }

    public void showCountries(ArrayList<String> countriesList) {
        System.out.println("\nLISTA DE PAÍSES:");
        for(String country: countriesList) {
            System.out.println(country);
        }
    }

    public void sortCountries(HashSet<String> countriesSet) {
        ArrayList<String> countriesList = new ArrayList<>(countriesSet);

        System.out.println("\nOrdenando los países alfabéticamente...");
        countriesList.sort(compareCountry);
        showCountries(countriesList);
    }

    public void searchCountry(HashSet<String> countriesSet) {
        Iterator<String> iterator = countriesSet.iterator();

        System.out.print("\nIngrese el país a buscar: ");
        String country = scanner.next();

        while(iterator.hasNext()) {
            if(iterator.next().equals(country)) {
                System.out.println("\nSe eliminó el país " + country);
                iterator.remove();
                return;
            }
        }

        System.out.println("\nNo se encontró un país con ese nombre en el conjunto");
    }

    public static Comparator<String> compareCountry = new Comparator<>() {
        @Override
        public int compare(String country1, String country2) {
            return country1.compareTo(country2);
        }
    };
}
