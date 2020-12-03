package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightScanner {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> airportInfo = new HashMap<>();
        airportInfo.put("Wroclaw", true);
        airportInfo.put("Warsaw", true);
        airportInfo.put("Berlin", true);
        airportInfo.put("Barcelona", true);
        airportInfo.put("London", false);

        if(airportInfo.containsKey(flight.getArrivalAirport())) {
            return airportInfo.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Route not found");
        }
    }

    public static void main(String[] args) {

        Flight flight = new Flight("Barcelona", "New York");
        FlightScanner flightScanner = new FlightScanner();

        try {
            if(flightScanner.findFlight(flight)) {
                System.out.println("Your flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available. Have a nice fly!");
            } else {
                System.out.println("Your flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is unavailable.");
            }

        } catch(RouteNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using our services");
        }
    }
}
