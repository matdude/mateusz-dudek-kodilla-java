package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String DRIVING = "DrivingTask";
    public static final String PAINTING = "PaintingTask";
    public static final String SHOPPING = "ShoppingTask";

    public final Task doTask(final String task){
        switch (task){
            case DRIVING:
                return new DrivingTask("Delivery","to Wroclaw","truck");
            case PAINTING:
                return new PaintingTask("Painting","green","walls");
            case SHOPPING:
                return new ShoppingTask("Shopping", "Pants", 1.0);
            default:
                return null;
        }
    }
}
