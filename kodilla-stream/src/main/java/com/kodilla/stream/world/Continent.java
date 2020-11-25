package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final List<Country> listOfCountriesOnContinent = new ArrayList<>();

    public Continent() {
    }

    public List<Country> getListOfCountriesOnContinent() {
        return new ArrayList<>(listOfCountriesOnContinent);
    }

    public void addCountry (Country country){
        listOfCountriesOnContinent.add(country);
    }
}
