package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        TaskQueue firstTask = new FirstTaskInQueue();
        TaskQueue secondTask = new SecondTaskInQueue();
        Mentor mentor1 = new Mentor("Mentor 1");
        Mentor mentor2 = new Mentor("Mentor 2");
        firstTask.registerObserver(mentor1);
        secondTask.registerObserver(mentor2);
        //When
        firstTask.addTask("Task 1");
        secondTask.addTask("Task 2");
        secondTask.addTask("Task 3");
        firstTask.addTask("Task 4");
        //Then
        assertEquals(2, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}
