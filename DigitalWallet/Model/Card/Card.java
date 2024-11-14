package Model.Card;

import java.time.LocalDateTime;

public class Card {
    private int cardID;
    private int userID;
    private int cardNumber;
    private LocalDateTime expirationDate;
    private int cvv;

    public Card(int cardID, int userID, int cardNumber, int cvv) {
        this.cardID = cardID;
        this.userID = userID;
        this.cardNumber = cardNumber;
        this.expirationDate = LocalDateTime.now().plusMonths(12);
        this.cvv = cvv;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardID=" + cardID +
                ", userID=" + userID +
                ", cardNumber=" + cardNumber +
                ", expirationDate=" + expirationDate +
                ", cvv=" + cvv +
                '}';
    }
}
