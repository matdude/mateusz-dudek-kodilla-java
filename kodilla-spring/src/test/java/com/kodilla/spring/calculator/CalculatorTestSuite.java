package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    void testAddingCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double expectedResult = 6.0;
        Double result = calculator.add(3, 3);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testSubtractingCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double expectedResult = 2.0;
        Double result = calculator.sub(4, 2);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testDividingCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double expectedResult = 3.0;
        Double result = calculator.div(9, 3);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void testMultiplyingCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double expectedResult = 6.0;
        Double result = calculator.mul(2, 3);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
