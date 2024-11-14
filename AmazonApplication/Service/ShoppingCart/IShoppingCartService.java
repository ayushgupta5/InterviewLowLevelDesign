package Service.ShoppingCart;

import Model.ShoppingCart.ShoppingCart;

public interface IShoppingCartService {
    void addItem(ShoppingCart shoppingCart);
    void removeItem(ShoppingCart shoppingCart);
    void getTotal(ShoppingCart shoppingCart);
}
