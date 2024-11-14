package Model.Notification;

public class Notification {
    private String message;
    private String status;
    private int recipientID;

    public Notification(String message, String status, int recipientID) {
        this.message = message;
        this.status = status;
        this.recipientID = recipientID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getRecipientID() {
        return recipientID;
    }

    public void setRecipientID(int recipientID) {
        this.recipientID = recipientID;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "message='" + message + '\'' +
                ", status='" + status + '\'' +
                ", recipientID=" + recipientID +
                '}';
    }
}
