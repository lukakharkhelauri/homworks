public class Car {
    String make;
    String model;
    int year;
    String carNumber;

    Car(
            String make,
            String model,
            int year,
            String carNumber
    ) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.carNumber = carNumber;
    }

    void printInfo() {
        System.out.println("Car: {");
        System.out.println("\tMake: " + make);
        System.out.println("\tModel: " + model);
        System.out.println("\tYear: " + year);
        System.out.println("\tcarNumber: " + carNumber);
        System.out.println(")");
    }
}
