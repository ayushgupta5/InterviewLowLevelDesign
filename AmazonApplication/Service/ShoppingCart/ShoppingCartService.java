package Service.ShoppingCart;

import Model.ShoppingCart.ShoppingCart;

public class ShoppingCartService implements IShoppingCartService {
    @Override
    public void addItem(ShoppingCart shoppingCart) {
        System.out.println("Adding the Item to the Shopping Cart : " + shoppingCart.toString());
    }

    @Override
    public void removeItem(ShoppingCart shoppingCart) {
        System.out.println("Removing the Item to the Shopping Cart : " + shoppingCart.toString());
    }

    @Override
    public void getTotal(ShoppingCart shoppingCart) {
        System.out.println("getting the Total Amount to the Shopping Cart : " + shoppingCart.toString());
    }
}
