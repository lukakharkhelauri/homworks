package ex2;

public class Shape {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void printDetails() {
        System.out.println("Shape details: x = " + x + ", y = " + y);
    }

    public double calculatePerimeter() {
        return 0;
    }
}
