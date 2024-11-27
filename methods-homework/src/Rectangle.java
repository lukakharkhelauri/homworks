public class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void displayPerimeter() {
        int perimeter = 2 * (length + width);
        System.out.println("Perimeter: " + perimeter);
    }

    void displayArea() {
        int area = length * width;
        System.out.println("Area: " + area);
    }

    void displayDiagonal() {
        //დიაგონალი როგორ გამოვითვალო?
        double diagonal = ((length * length) + (width * width));
        System.out.println("Diagonal: " + diagonal);
    }

    void displayIsSquare() {
        if (length == width) {
            System.out.println("Square.");
        } else {
            System.out.println("Not a square.");
        }
    }
}
