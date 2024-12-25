package ex1;

public class Square extends NormalNGon {

    public Square(double sideLength) {
        super(4, sideLength);
    }


    @Override
    public double Perimeter() {
        return 4 * sideLength;
    }
}
