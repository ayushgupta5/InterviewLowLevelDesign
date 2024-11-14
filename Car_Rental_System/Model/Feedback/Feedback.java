package Model.Feedback;

public class Feedback {
    private int feedBackID;
    private int rentalID;
    private int userID;
    private int rating;
    private String comment;

    public Feedback(int feedBackID, int rentalID, int userID, int rating, String comment) {
        this.feedBackID = feedBackID;
        this.rentalID = rentalID;
        this.userID = userID;
        this.rating = rating;
        this.comment = comment;
    }

    public int getFeedBackID() {
        return feedBackID;
    }

    public void setFeedBackID(int feedBackID) {
        this.feedBackID = feedBackID;
    }

    public int getRentalID() {
        return rentalID;
    }

    public void setRentalID(int rentalID) {
        this.rentalID = rentalID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedBackID=" + feedBackID +
                ", rentalID=" + rentalID +
                ", userID=" + userID +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }
}
