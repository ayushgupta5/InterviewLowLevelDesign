package Service.CoffeeMachine;

import Model.CoffeeMachine.CoffeeMachine;

public interface ICoffeeMachineService {
    void selectCoffeeType(CoffeeMachine coffeeMachine);
    void addExtras(CoffeeMachine coffeeMachine);
    void makePayment(CoffeeMachine coffeeMachine);
    void dispenseCoffee(CoffeeMachine coffeeMachine);
    void restockIngredients(CoffeeMachine coffeeMachine);
}
