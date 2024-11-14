package Service.Coffee;

import Model.Coffee.Coffee;

public class CoffeeService implements ICoffeeService {
    @Override
    public void calculatePrice(Coffee coffee) {
        System.out.println("Calculating the Price : " + coffee.toString());
    }
}
