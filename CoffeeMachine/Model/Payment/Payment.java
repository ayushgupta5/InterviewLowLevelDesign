package Model.Payment;

public class Payment {
    private int paymentID;
    private String method;
    private double amount;

    public Payment(int paymentID, String method, double amount) {
        this.paymentID = paymentID;
        this.method = method;
        this.amount = amount;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentID=" + paymentID +
                ", method='" + method + '\'' +
                ", amount=" + amount +
                '}';
    }
}
