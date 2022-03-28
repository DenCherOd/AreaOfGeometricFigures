package areaOfGeometricFigures;

public class Circle implements GeometricFigure {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateTheArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}
