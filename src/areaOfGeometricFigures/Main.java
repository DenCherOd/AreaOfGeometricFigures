package areaOfGeometricFigures;

public class Main {
    public static void main(String[] args) {
        double totalArea = 0.0;
        GeometricFigure [] figures = {
                new Circle(3),
                new Square(2),
                new Triangle(3,4,5)
        };
        for(GeometricFigure figure : figures){
            totalArea += figure.calculateTheArea();
        }
        System.out.println("Total " + totalArea);
    }
}