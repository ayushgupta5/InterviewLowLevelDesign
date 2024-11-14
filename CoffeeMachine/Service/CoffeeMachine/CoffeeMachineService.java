package Service.CoffeeMachine;

import Model.CoffeeMachine.CoffeeMachine;

public class CoffeeMachineService implements ICoffeeMachineService {
    @Override
    public void selectCoffeeType(CoffeeMachine coffeeMachine) {
        System.out.println("Selecting the Coffee Type : " + coffeeMachine.toString());
    }

    @Override
    public void addExtras(CoffeeMachine coffeeMachine) {
        System.out.println("Adding the Extras : " + coffeeMachine.toString());
    }

    @Override
    public void makePayment(CoffeeMachine coffeeMachine) {
        System.out.println("Making the Coffee Payment : " + coffeeMachine.toString());
    }

    @Override
    public void dispenseCoffee(CoffeeMachine coffeeMachine) {
        System.out.println("Dispensing the Coffee Machine : " + coffeeMachine.toString());
    }

    @Override
    public void restockIngredients(CoffeeMachine coffeeMachine) {
        System.out.println("Restock Ingredients : " + coffeeMachine.toString());
    }
}
