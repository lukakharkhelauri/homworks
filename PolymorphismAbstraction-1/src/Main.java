import employee.FixedSalary;
import ex1.NormalNGon;
import ex1.Square;
//import ex1.Triangle;
//import toys.Car;
import toys.Doll;
import employee.DaysSalary;
import ex5.Car;
import ex2.Triangle;
import ex2.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exercise 1
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the number of sides for the regular n-gon: ");
//        int n = scanner.nextInt();
//        System.out.print("Enter the length of each side for the regular n-gon: ");
//        double sideLengthN = scanner.nextDouble();
//        NormalNGon nGon = new NormalNGon(n, sideLengthN);
//        System.out.print("Enter the side length of the square: ");
//        double sideLengthSquare = scanner.nextDouble();
//        Square square = new Square(sideLengthSquare);
//        System.out.print("Enter the side length of the equilateral triangle: ");
//        double sideLengthTriangle = scanner.nextDouble();
//        Triangle triangle = new Triangle(sideLengthTriangle);
//        System.out.printf("Perimeter of the regular n-gon: ", nGon.Perimeter());
//        System.out.printf("Perimeter of the square: ", square.Perimeter());
//        System.out.printf("Perimeter of the equilateral triangle: ", triangle.Perimeter());
//        scanner.close();
        // end of exercise 1

        //exercise 2
//        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
//        triangle.printDetails();
//        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
//
//        Rectangle rectangle = new Rectangle(6.0, 8.0);
//        rectangle.printDetails();
//        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        //end of exercise 2


        // exercise 3
//        Car car = new Car(523.4, 123.5, 4);
//        System.out.println("Car price: " + car.calculatePrice() + " ₾");
//
//        Doll doll = new Doll(20.0, 45.0);
//        System.out.println("Dolly price: " + doll.calculatePrice() + " ₾");
        // end of exercise 3


        //exercise 4
//        DaysSalary Person1 = new DaysSalary("Giorgi", "Gobejishvili", 598312331, 31, 100);
//        System.out.println("Person1 Salary = " + Person1.calculateSalaryPerDay() + " ₾");
//
//        FixedSalary Person2 = new FixedSalary("Andria", "Tabatadze", 595672567, 2500.0);
//        System.out.println("Person1 Salary = " + Person2.getFixedSalary() + " ₾");
        // end of exercise 4

        //exercose 5
        Car Car = new Car();

        Car.start();
        Car.left();
        Car.right();
        Car.stop();
    }
}