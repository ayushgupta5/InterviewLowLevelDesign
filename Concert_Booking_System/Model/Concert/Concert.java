package Model.Concert;

import java.time.LocalDateTime;

public class Concert {
    private int concertID;
    private String artistName;
    private LocalDateTime date;
    private String venue;
    private int totalSeats;
    private int availableSeats;

    public Concert(int concertID, String artistName, String venue, int totalSeats, int availableSeats) {
        this.concertID = concertID;
        this.artistName = artistName;
        this.date = LocalDateTime.now();
        this.venue = venue;
        this.totalSeats = totalSeats;
        this.availableSeats = availableSeats;
    }

    public int getConcertID() {
        return concertID;
    }

    public void setConcertID(int concertID) {
        this.concertID = concertID;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return "Concert{" +
                "concertID=" + concertID +
                ", artistName='" + artistName + '\'' +
                ", date=" + date +
                ", venue='" + venue + '\'' +
                ", totalSeats=" + totalSeats +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
