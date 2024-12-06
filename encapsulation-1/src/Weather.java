public class Weather {
    private String cityName;
    private double windSpeed; // in km/h
    private double rainProbability; // in percentage (0-100)
    private boolean isRaining;
    private boolean isCloudy;
    private boolean isSunny;

    public Weather(String cityName, double windSpeed, double rainProbability,
                           boolean isRaining, boolean isCloudy, boolean isSunny) {
        this.cityName = cityName;
        this.windSpeed = windSpeed;
        this.rainProbability = rainProbability;
        this.isRaining = isRaining;
        this.isCloudy = isCloudy;
        this.isSunny = isSunny;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        if (windSpeed >= 0) {
            this.windSpeed = windSpeed;
        } else {
            System.out.println("Wind speed must be non-negative.");
        }
    }

    public double getRainProbability() {
        return rainProbability;
    }

    public void setRainProbability(double rainProbability) {
        if (rainProbability >= 0 && rainProbability <= 100) {
            this.rainProbability = rainProbability;
        } else {
            System.out.println("Rain probability must be between 0 and 100.");
        }
    }

    public boolean isRaining() {
        return isRaining;
    }

    public void setRaining(boolean raining) {
        isRaining = raining;
    }

    public boolean isCloudy() {
        return isCloudy;
    }

    public void setCloudy(boolean cloudy) {
        isCloudy = cloudy;
    }

    public boolean isSunny() {
        return isSunny;
    }

    public void setSunny(boolean sunny) {
        isSunny = sunny;
    }

    public void printForecast() {
        System.out.println("Weather Forecast for " + cityName + ":");
        System.out.println("\tWind Speed: " + windSpeed + " km/h");
        System.out.println("\tRain Probability: " + rainProbability + "%");
        System.out.println("\tRaining: " + (isRaining ? "Yes" : "No"));
        System.out.println("\tCloudy: " + (isCloudy ? "Yes" : "No"));
        System.out.println("\tSunny: " + (isSunny ? "Yes" : "No"));
    }

    public boolean recommendForWalk() {
        return !isRaining && windSpeed < 20 && rainProbability < 20 && (isSunny || !isCloudy);
    }
}

