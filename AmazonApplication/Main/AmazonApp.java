package Main;

import Model.Order.Order;
import Model.Payment.Payment;
import Model.Product.Product;
import Model.ShoppingCart.ShoppingCart;
import Model.User.User;
import Service.Order.IOrderService;
import Service.Order.OrderService;
import Service.Payment.CreditCard;
import Service.Payment.PaymentStrategy;
import Service.Payment.UPI;
import Service.Product.IProductService;
import Service.Product.ProductService;
import Service.ShoppingCart.IShoppingCartService;
import Service.ShoppingCart.ShoppingCartService;
import Service.User.IUserService;
import Service.User.UserService;

public class AmazonApp {
    public static void main(String[] args) {
        User user = new User(1, "Kohli", "kohli@gmail.com", "123", "Delhi");
        Product product = new Product(1, "Bat", "Bat", 100.00, 12);
        ShoppingCart shoppingCart = new ShoppingCart(1, 1);
        Order order = new Order(1, 1, 100.00, "Processing");
        Payment payment = new Payment(1, 1, "Processing", "UPI");

        IUserService userService = new UserService();
        userService.register();
        userService.login(user);
        userService.logout(user);
        userService.updateProfile(user);

        IProductService productService = new ProductService();
        productService.getDetails(product);
        productService.updateStock(product);

        IShoppingCartService shoppingCartService = new ShoppingCartService();
        shoppingCartService.removeItem(shoppingCart);
        shoppingCartService.addItem(shoppingCart);
        shoppingCartService.getTotal(shoppingCart);

        IOrderService orderService = new OrderService();
        orderService.trackOrder(order);
        orderService.placeOrder(order);

        pay(payment);
        payment.setMethod("Credit_Card");
        pay(payment);
    }

    private static void pay(Payment payment) {
        PaymentStrategy paymentStrategy;
        if(payment.getMethod() == "UPI") {
            paymentStrategy = new UPI();
        } else {
            paymentStrategy = new CreditCard();
        }
        paymentStrategy.processPayment(payment);
    }
}
