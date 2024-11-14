package Model.Transaction;

import java.time.LocalDateTime;

public class Transaction {
    private int transactionID;
    private int walletID;
    private double amount;
    private String type;
    private LocalDateTime timestamp;

    public Transaction(int transactionID, int walletID, double amount, String type) {
        this.transactionID = transactionID;
        this.walletID = walletID;
        this.amount = amount;
        this.type = type;
        this.timestamp = LocalDateTime.now();
    }

    public int getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(int transactionID) {
        this.transactionID = transactionID;
    }

    public int getWalletID() {
        return walletID;
    }

    public void setWalletID(int walletID) {
        this.walletID = walletID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID=" + transactionID +
                ", walletID=" + walletID +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
