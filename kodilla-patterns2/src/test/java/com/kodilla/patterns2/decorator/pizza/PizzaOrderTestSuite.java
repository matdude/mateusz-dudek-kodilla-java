package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato souce + cheese", description);
    }

    @Test
    public void testPizzaWithExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithExtraCheese(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testPizzaWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithExtraCheese(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato souce + cheese + extra cheese", description);
    }

    @Test
    public void testPizzaWithExtraCheeseAndSalamiGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithExtraCheese(theOrder);
        theOrder = new PizzaWithSalami(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testPizzaWithExtraCheeseAndSalamiGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithExtraCheese(theOrder);
        theOrder = new PizzaWithSalami(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato souce + cheese + extra cheese + salami", description);
    }

    @Test
    public void testPizzaWithExtraCheeseAndSalamiAndPineappleGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithExtraCheese(theOrder);
        theOrder = new PizzaWithSalami(theOrder);
        theOrder = new PizzaWithPineapple(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), calculatedCost);
    }

    @Test
    public void testPizzaWithExtraCheeseAndSalamiAndPineappleGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new PizzaWithExtraCheese(theOrder);
        theOrder = new PizzaWithSalami(theOrder);
        theOrder = new PizzaWithPineapple(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza with tomato souce + cheese + extra cheese + salami + pineapple", description);
    }
}
