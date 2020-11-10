package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        System.out.println("Test 1");
        if (Calculator.add(2, 3) == 5) {
            System.out.println("Ok");
        }
        else {
            System.out.println("Something went wrong");
        }
        System.out.println("Test 2");
        if (Calculator.substract(3, 2) == 1) {
            System.out.println("Ok");
        }
        else {
            System.out.println("Something went wrong");
        }
    }
}
