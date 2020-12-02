package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1, 1.5);
        } catch (Exception e) {
            System.out.println("Something went wrong " + e);
        } finally {
            System.out.println("I will always be here");
        }
    }
}
