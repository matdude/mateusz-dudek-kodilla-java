package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {
    private String departureAirport;
    private String arrivalAirport;
    private Integer flightNo;

    public Flight(String departureAirport, String arrivalAirport, Integer flightNo) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightNo = flightNo;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(departureAirport, flight.departureAirport) &&
                Objects.equals(arrivalAirport, flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(departureAirport, arrivalAirport);
    }

    @Override
    public String toString() {
        return "Flight number: " + flightNo +
                " from: " + departureAirport +
                " to: " + arrivalAirport;
    }
}
