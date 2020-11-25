package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final BigDecimal peopleQuantity;

    public Country(final String countryName, final BigDecimal peopleQty) {
        this.peopleQuantity = peopleQty;
    }

    public BigDecimal getPeopleQuantity(){
        return peopleQuantity;
    }
}