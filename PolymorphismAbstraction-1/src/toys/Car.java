package toys;

public class Car extends Toy{
    private double cabinPrice;
    private double wheelPrice;
    private int numberOfWheels;

    public Car(double cabinPrice, double wheelPrice, int numberOfWheels) {
        this.cabinPrice = cabinPrice;
        this.wheelPrice = wheelPrice;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public double calculatePrice() {
        return cabinPrice + (wheelPrice * numberOfWheels);
    }
}

