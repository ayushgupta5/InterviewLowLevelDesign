package Service.Order;

import Model.Order.Order;

public class OrderService implements IOrderService {
    @Override
    public void placeOrder(Order order) {
        System.out.println("Placing the Order : " +order.toString());
    }

    @Override
    public void trackOrder(Order order) {
        System.out.println("Tracking the Order : " +order.toString());
    }
}
