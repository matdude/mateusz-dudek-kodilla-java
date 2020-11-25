package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent europa = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();

        Country poland = new Country("Poland", new BigDecimal("1000000"));
        Country germany = new Country("Germany", new BigDecimal("1000000"));
        Country france = new Country("France", new BigDecimal("1000000"));
        Country japan = new Country("Japan", new BigDecimal("1000000"));
        Country china = new Country("China", new BigDecimal("1000000"));
        Country thailand = new Country("Thailand", new BigDecimal("1000000"));
        Country kongo = new Country("Kongo", new BigDecimal("1000000"));
        Country rsa = new Country("RSA", new BigDecimal("1000000"));
        Country egipt = new Country("Egipt", new BigDecimal("1000000"));

        world.addContinent(europa);
        world.addContinent(asia);
        world.addContinent(africa);

        europa.addCountry(poland);
        europa.addCountry(germany);
        europa.addCountry(france);

        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(thailand);

        africa.addCountry(kongo);
        africa.addCountry(rsa);
        africa.addCountry(egipt);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();

        //Then
        BigDecimal totalPeopleExpected = new BigDecimal("9000000");
        assertEquals(totalPeopleExpected, totalPeople);
    }
}
