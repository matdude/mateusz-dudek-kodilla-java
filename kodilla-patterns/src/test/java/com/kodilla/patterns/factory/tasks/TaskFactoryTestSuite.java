package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.doTask(TaskFactory.DRIVING);
        //Then
        Assertions.assertEquals("Delivery", driving.getTaskName());
    }
    @Test
    void testFactoryPainting(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.doTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        Assertions.assertEquals("Painting", painting.getTaskName());
        Assertions.assertTrue(painting.isTaskExecuted());
    }
    @Test
    void testFactoryShopping(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.doTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        Assertions.assertEquals("Shopping", shopping.getTaskName());
        Assertions.assertTrue(shopping.isTaskExecuted());
    }
}
