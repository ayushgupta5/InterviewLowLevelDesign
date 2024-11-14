package Main;

import Model.Coffee.Coffee;
import Model.CoffeeMachine.CoffeeMachine;
import Model.Extras.Extra;
import Model.Payment.Payment;
import Service.Coffee.CoffeeService;
import Service.Coffee.ICoffeeService;
import Service.CoffeeMachine.CoffeeMachineService;
import Service.CoffeeMachine.ICoffeeMachineService;
import Service.Extras.ExtraService;
import Service.Extras.IExtraService;
import Service.Inventory.IInventoryService;
import Service.Inventory.InventoryService;
import Service.Payment.CreditCard;
import Service.Payment.PaymentService;
import Service.Payment.PaymentStrategy;
import Service.Payment.UPI;

public class CoffeeMachineApp {
    public static void main(String[] args) {
        Coffee coffee = new Coffee("Coffee", 100.00, 10, 10);
        CoffeeMachine coffeeMachine = new CoffeeMachine(10, 11, 11, 11, "Inventory");
        Payment payment = new Payment(1, "UPI", 300.00);
        Extra extra = new Extra("Extra", 12.11);


        ICoffeeMachineService coffeeMachineService = new CoffeeMachineService();
        coffeeMachineService.dispenseCoffee(coffeeMachine);
        coffeeMachineService.selectCoffeeType(coffeeMachine);
        coffeeMachineService.addExtras(coffeeMachine);
        coffeeMachineService.makePayment(coffeeMachine);
        coffeeMachineService.restockIngredients(coffeeMachine);

        ICoffeeService coffeeService = new CoffeeService();
        coffeeService.calculatePrice(coffee);

        IExtraService extraService = new ExtraService();
        extraService.addExtra(extra);

        IInventoryService inventoryService = new InventoryService();
        inventoryService.restock();
        inventoryService.updateStock();
        inventoryService.checkStock();

        paymentProcess(payment);
        payment.setMethod("CreditCard");
        paymentProcess(payment);
    }

    private static void paymentProcess(Payment payment) {
        PaymentStrategy paymentStrategy;
        if(payment.getMethod()=="UPI") {
            paymentStrategy = new UPI();
        } else {
            paymentStrategy = new CreditCard();
        }
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(paymentStrategy);
        paymentService.pay(payment);
    }
}
