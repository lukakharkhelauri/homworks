package toys;

public class Doll extends Toy{
    private double hairPrice;
    private double clothingPrice;

    public Doll(double hairPrice, double clothingPrice) {
        this.hairPrice = hairPrice;
        this.clothingPrice = clothingPrice;
    }

    @Override
    public double calculatePrice() {
        return hairPrice + clothingPrice;
    }
}
