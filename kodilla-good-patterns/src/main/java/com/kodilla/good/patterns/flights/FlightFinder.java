package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
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

    public List<List<Flight>> findStopoverAirport(String searchedDepartureAirport, String searchedArrivalAirport) {
        Set<Flight> startAirports = findFlightFromAirport(searchedDepartureAirport);
        Set<Flight> endAirports = findFlightToAirport(searchedArrivalAirport);

        List<Flight> firstPart = startAirports.stream()
                .filter(flight -> endAirports.contains(new Flight(flight.getArrivalAirport(), searchedArrivalAirport, null))
                ).collect(Collectors.toList());

//        System.out.println(startAirports);
//        System.out.println(endAirports);
//        System.out.println(firstPart);

        List<List<Flight>> result = new ArrayList<>();
        firstPart.forEach(flight -> {
            List<Flight> flights = new ArrayList<>();
            flights.add(flight);
            flights.add(endAirports.stream()
                    .filter(p -> p.getDepartureAirport().equals(flight.getArrivalAirport()))
            .findFirst()
            .get());

            result.add(flights);
        });
        return result;
    }

}
