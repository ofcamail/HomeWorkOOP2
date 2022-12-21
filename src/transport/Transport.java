package transport;

public class Transport {
    protected String brand;
    protected String model;
    protected final int year;
    protected final String country;
    protected String colour;
    protected int maxSpeed;
    public Transport(String brand, String model, int year, String country, String colour, int maxSpeed) {

        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }


        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }


        if (year <= 0) {
            this.year = 2020;
        } else {
            this.year = year;
        }


        if (country == null || country.isBlank() || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }

        this.colour = colour;
        this.maxSpeed = maxSpeed;


        if (colour == null || colour.isBlank() || colour.isEmpty()) {
            this.colour = "default";
        } else {
            this.colour = colour;
        }


        if (maxSpeed <= 0) {
            this.maxSpeed = Math.abs(maxSpeed);
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getReleaseYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColour() {
        return colour;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void setColour(String colour) {
        if (colour == null || colour.isBlank() || colour.isEmpty()) {
            this.colour = "Белый";
        } else {
            this.colour = colour;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = Math.abs(maxSpeed);
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}
