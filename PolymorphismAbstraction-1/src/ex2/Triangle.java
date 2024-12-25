package ex2;

public class Triangle extends Shape {
    private double z;

    public Triangle(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void printDetails() {
        System.out.println("Triangle details: x = " + x + ", y = " + y + ", z = " + z);
    }

    @Override
    public double calculatePerimeter() {
        return x + y + z;
    }
}
