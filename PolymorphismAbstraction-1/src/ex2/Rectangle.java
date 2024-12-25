package ex2;

public class Rectangle extends Shape{
    public Rectangle(double x, double y) {
        super(x, y);
    }

    @Override
    public void printDetails() {
        System.out.println("Rectangle details: width = " + x + ", height = " + y);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (x + y);
    }
}
