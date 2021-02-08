package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlightApp {

    public static void main(String[] args)  {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight("Wroclaw", "Berlin", 1));
        flights.add(new Flight("Wroclaw", "Rome", 2));
        flights.add(new Flight("Berlin", "Tokyo", 3));
        flights.add(new Flight("Tokyo", "Berlin", 4));
        flights.add(new Flight("Gdansk", "Oslo", 5));
        flights.add(new Flight("Oslo", "Gdansk", 6));

        FlightFinder flightFinder = new FlightFinder(flights);

        Set<Flight> flightsFromWroclaw = flightFinder.findFlightFromAirport("Wroclaw");
        Set<Flight> flightsToTokyo = flightFinder.findFlightToAirport("Tokyo");
        List<List<Flight>> stopOver = flightFinder.findStopoverAirport("Wroclaw", "Tokyo");


//        System.out.println("Flights from Wroclaw: " + flightsFromWroclaw);
//        System.out.println("Flights to Tokyo: " + flightsToTokyo);
        System.out.println(stopOver);

    }
}
