package Model.Payment;

public class Payment {
    private int paymentID;
    private int orderID;
    private String status;
    private String method;

    public Payment(int paymentID, int orderID, String status, String method) {
        this.paymentID = paymentID;
        this.orderID = orderID;
        this.status = status;
        this.method = method;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", orderID=" + orderID +
                ", status='" + status + '\'' +
                ", method='" + method + '\'' +
                '}';
    }
}
