package Model.Rental;

import java.time.LocalDateTime;

public class Rental {
    private int rentalID;
    private int carID;
    private int userID;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private double totalAmount;
    private String status;

    public Rental(int rentalID, int carID, int userID, double totalAmount, String status) {
        this.rentalID = rentalID;
        this.carID = carID;
        this.userID = userID;
        this.startDate = LocalDateTime.now();
        this.endDate = LocalDateTime.now().plusDays(365);
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int getRentalID() {
        return rentalID;
    }

    public void setRentalID(int rentalID) {
        this.rentalID = rentalID;
    }

    public int getCarID() {
        return carID;
    }

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rentalID=" + rentalID +
                ", carID=" + carID +
                ", userID=" + userID +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
