package Collections.P105;

import Collections.P105.services.CountryService;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        CountryService countryService = new CountryService();
        HashSet<String> countriesSet = new HashSet<>();

        countryService.addCountries(countriesSet);
        countryService.showCountries(countriesSet);
        countryService.sortCountries(countriesSet);
        countryService.searchCountry(countriesSet);
        countryService.showCountries(countriesSet);
    }
}
