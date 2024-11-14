package Model.Car;

public class Car {
    private int carID;
    private String model;
    private String year;
    private double pricePerDay;
    private String availabilityStatus;

    public Car(int carID, String model, String year, double pricePerDay, String availabilityStatus) {
        this.carID = carID;
        this.model = model;
        this.year = year;
        this.pricePerDay = pricePerDay;
        this.availabilityStatus = availabilityStatus;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carID=" + carID +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", pricePerDay=" + pricePerDay +
                ", availabilityStatus='" + availabilityStatus + '\'' +
                '}';
    }
}
