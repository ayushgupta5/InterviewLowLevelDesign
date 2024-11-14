package Model.Booking;

public class Booking {
    private int bookingID;
    private String seatNumber;
    private String status;
    private String paymentStatus;

    public Booking(int bookingID, String seatNumber, String status, String paymentStatus) {
        this.bookingID = bookingID;
        this.seatNumber = seatNumber;
        this.status = status;
        this.paymentStatus = paymentStatus;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", seatNumber='" + seatNumber + '\'' +
                ", status='" + status + '\'' +
                ", paymentStatus='" + paymentStatus + '\'' +
                '}';
    }
}
