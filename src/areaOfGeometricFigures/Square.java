package areaOfGeometricFigures;

public class Square implements GeometricFigure {
    int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateTheArea() {
        return Math.pow(sideLength, 2);
    }
}