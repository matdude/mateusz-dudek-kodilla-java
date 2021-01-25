package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreApp {

    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        String stringOfBooks = movieStore.getMovies().values().stream()
                .flatMap(s -> s.stream())
                .collect(Collectors.joining("!"));
        System.out.println(stringOfBooks);
    }
}
