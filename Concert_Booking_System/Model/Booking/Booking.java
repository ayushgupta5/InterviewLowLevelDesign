package Model.Booking;

public class Booking {
    private int bookingID;
    private int userID;
    private int concertID;
    private int numberOfTickets;
    private String status;

    public Booking(int bookingID, int userID, int concertID, int numberOfTickets, String status) {
        this.bookingID = bookingID;
        this.userID = userID;
        this.concertID = concertID;
        this.numberOfTickets = numberOfTickets;
        this.status = status;
    }

    public int getBookingID() {
        return bookingID;
    }

    public void setBookingID(int bookingID) {
        this.bookingID = bookingID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getConcertID() {
        return concertID;
    }

    public void setConcertID(int concertID) {
        this.concertID = concertID;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingID=" + bookingID +
                ", userID=" + userID +
                ", concertID=" + concertID +
                ", numberOfTickets=" + numberOfTickets +
                ", status='" + status + '\'' +
                '}';
    }
}
