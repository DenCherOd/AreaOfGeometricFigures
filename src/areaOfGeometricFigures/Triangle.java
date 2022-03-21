package areaOfGeometricFigures;

public class Triangle implements GeometricFigure {
    int aSideLength;
    int bSideLength;
    int cSideLength;

    public Triangle(int aSideLength, int bSideLength, int cSideLength) {
        this.aSideLength = aSideLength;
        this.bSideLength = bSideLength;
        this.cSideLength = cSideLength;
    }

    @Override
    public double calculateTheArea() {
        double halfPerimeter = (aSideLength + bSideLength + cSideLength) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - aSideLength) * (halfPerimeter - bSideLength) * (halfPerimeter - cSideLength));
    }
}