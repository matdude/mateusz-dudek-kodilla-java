package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent>listOfContinentsOnTheWorld = new ArrayList<>();

    public void addContinent(Continent continent){
        listOfContinentsOnTheWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity(){

        return listOfContinentsOnTheWorld.stream()
                .flatMap(continent -> continent.getListOfCountriesOnContinent().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
