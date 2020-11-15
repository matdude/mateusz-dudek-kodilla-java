package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests...");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println(" This is the end of tests.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\n Preparing to execute test #" + testCounter);
    }

    @AfterEach
    public void afterEveryTest () {
        System.out.println("Test #" + testCounter + " is finished!");
    }

    @Nested
    @DisplayName("Adding an removing tests")
    class TestAddingRemoving {
        @Test
        public void testAddFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(5);
            //when
            shapeCollector.addFigure(circle);
            //then
            assertEquals(circle, shapeCollector.getFigure(0));
        }

        @Test
        public void testRemoveFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle(6, 2);
            shapeCollector.addFigure(triangle);
            //when
            shapeCollector.removeFigure(triangle);
            //then
            assertEquals(0, shapeCollector.getShapeList().size());

        }
    }

    @Nested
    @DisplayName("getFigure and showFigures tests")
    class TestGetShow {
        @Test
        public void testGetFigure() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle(1);
            shapeCollector.addFigure(circle);
            //when
            Shape shapeResult = shapeCollector.getFigure(0);
            //then
            assertEquals(circle, shapeResult);
        }

        @Test
        public void testShowFigures() {
            //given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(5);
            shapeCollector.addFigure(square);
            //when
            String expectedMessage = "Square";
            String message = shapeCollector.showFigures();
            //then
            assertEquals(expectedMessage, message);
        }
    }
}
