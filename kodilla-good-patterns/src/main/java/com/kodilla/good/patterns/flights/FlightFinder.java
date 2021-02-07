package com.kodilla.good.patterns.flights;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {
    private Set<Flight> flights;

    public FlightFinder(Set<Flight> flights) {
        this.flights = flights;
    }

    public Set<Flight> findFlightFromAirport(String searchedDepartureAirport) {
        return flights.stream()
                .filter(n -> n.getDepartureAirport().equals(searchedDepartureAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findFlightToAirport(String searchedArrivalAirport) {
        return flights.stream()
                .filter(n -> n.getArrivalAirport().equals(searchedArrivalAirport))
                .collect(Collectors.toSet());
    }

    public Set<Flight> findStopoverAirport(String searchedDepartureAirport, String searchedArrivalAirport) {
        Set<Flight> startAirports = findFlightFromAirport(searchedDepartureAirport);
        Set<Flight> endAirports = findFlightToAirport(searchedArrivalAirport);

        List<Flight> firstPart = endAirports.stream()
                .filter(flight ->  flight.getDepartureAirport().contains(
                        startAirports.stream()
                        .map(v -> v.getArrivalAirport())
                        .collect(Collectors.toList())

                ))
    }

}
