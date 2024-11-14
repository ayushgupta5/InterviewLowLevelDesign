package Service.Payment;

import Model.Payment.Payment;

public class CreditCard implements PaymentStrategy {
    @Override
    public void processPayment(Payment payment) {
        System.out.println("CreditCard Payment is in Process");
    }
}
