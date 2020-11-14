package com.kodilla.testing.collection;

import java.util.List;
import java.util.ArrayList;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers){
        ArrayList<Integer>evenNumbersList = new ArrayList<>();

        for(int number : numbers){
            if(number%2==0){
                evenNumbersList.add(number);
            }
        }
        return evenNumbersList;
    }

}
