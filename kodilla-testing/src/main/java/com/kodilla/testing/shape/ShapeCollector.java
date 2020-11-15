package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeList = new ArrayList<>();

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n < shapeList.size()) {
            return shapeList.get(n);
        } else {
            return null;
        }
    }

    public String showFigures() {
        String figure = "";
        for (int i = 0; i < shapeList.size(); i++) {
            if (i == shapeList.size() - 1) {
                figure += shapeList.get(i).getShapeName();
            } else {
                figure += shapeList.get(i).getShapeName() + " ";
            }
        }
        return figure;
    }
}
