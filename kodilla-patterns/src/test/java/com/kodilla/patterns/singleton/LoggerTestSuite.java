package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.LOG;
        logger.log("Log");
        logger.log("log1");
        //When
        String result = logger.getLastLog();
        //Then
        Assertions.assertEquals("log1", result);
    }
}
