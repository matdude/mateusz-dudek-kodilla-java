package com.kodilla.testing.collection;

import java.util.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When created list is empty then resultList should be empty")

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();

        //When
        List<Integer> resultList = exterminator.exterminate(emptyList);

        //Then
        Assertions.assertEquals(emptyList, resultList);
    }

    @DisplayName("When exterminate is used on normalList then it should be equal to expectedResultList")

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(7);

        ArrayList<Integer>expectedResultList = new ArrayList<>();
        expectedResultList.add(2);
        expectedResultList.add(4);
        expectedResultList.add(6);

        //When
        List<Integer> resultList = exterminator.exterminate(normalList);

        //Then
        Assertions.assertEquals(expectedResultList, resultList);
    }

}
