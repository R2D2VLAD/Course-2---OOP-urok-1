public class Car {
    public String brand;
    public String model;
    public int year;
    public String country;
    public String color;
    public double engineVolume;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public String getCountry() {
        return this.country;
    }

    public String getColor() {
        return this.color;
    }

    public double getEngineVolume() {
        return this.engineVolume;
    }

    @Override
    public String toString() {
        return getBrand()+ " " + getModel() + ", "+ getYear() + " год выпуска, сборка в " + getCountry() +
                ", " + getColor() + ", объём двигателя - " + getEngineVolume() + " л.";
    }
}
