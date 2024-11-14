package Model.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int cartID;
    private int userID;
    private List<String> items;

    public ShoppingCart(int cartID, int userID) {
        this.cartID = cartID;
        this.userID = userID;
        this.items = new ArrayList<>();
    }

    public int getCartID() {
        return cartID;
    }

    public void setCartID(int cartID) {
        this.cartID = cartID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartID=" + cartID +
                ", userID=" + userID +
                ", items=" + items +
                '}';
    }
}
