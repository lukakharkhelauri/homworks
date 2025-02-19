import java.io.Serializable;

public class Country implements Serializable {
    private String countryName;
    private int countryPopulation;
    private double countryArea;

    public Country(String countryName, int countryPopulation, double countryArea) {
        this.countryName = countryName;
        this.countryPopulation = countryPopulation;
        this.countryArea = countryArea;
    }

    public double getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(double countryArea) {
        this.countryArea = countryArea;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public int getCountryPopulation() {
        return countryPopulation;
    }

    public void setCountryPopulation(int countryPopulation) {
        this.countryPopulation = countryPopulation;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryArea=" + countryArea +
                ", countryName='" + countryName + '\'' +
                ", countryPopulation=" + countryPopulation +
                '}';
    }
}
