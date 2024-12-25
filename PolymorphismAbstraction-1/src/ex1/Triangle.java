package ex1;

public class Triangle extends NormalNGon {

    public Triangle(double sideLength) {
        super(3, sideLength);
    }

    @Override
    public double Perimeter() {
        return 3 * sideLength;
    }
}
