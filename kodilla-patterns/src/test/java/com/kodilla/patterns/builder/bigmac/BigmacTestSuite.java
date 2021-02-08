package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BigmacTestSuite {
    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .sauce("standard")
                .ingredient("pickles")
                .ingredient("cheese")
                .burgers(2)
                .ingredient("onion")
                .build();
        System.out.println(bigmac);
        //When
        int howManyBurgers = bigmac.getBurgers();
        int howManyIngredient = bigmac.getIngredients().size();
        //Then
        Assertions.assertEquals(2, howManyBurgers);
        Assertions.assertEquals(3, howManyIngredient);
    }
}
