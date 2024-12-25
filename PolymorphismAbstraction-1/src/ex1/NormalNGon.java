package ex1;

public class NormalNGon {
    protected int numberOfSides;
    protected double sideLength;

    public NormalNGon(int numberOfSides, double sideLength) {
        this.numberOfSides = numberOfSides;
        this.sideLength = sideLength;
    }

    public double Perimeter() {
        return numberOfSides * sideLength;
    }
}
