package Model.Order;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderID;
    private int userID;
    private List<String> orderItems;
    private double totalAmount;
    private String status;

    public Order(int orderID, int userID, double totalAmount, String status) {
        this.orderID = orderID;
        this.userID = userID;
        this.orderItems = new ArrayList<>();
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<String> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<String> orderItems) {
        this.orderItems = orderItems;
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
        return "Order{" +
                "orderID=" + orderID +
                ", userID=" + userID +
                ", orderItems=" + orderItems +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
