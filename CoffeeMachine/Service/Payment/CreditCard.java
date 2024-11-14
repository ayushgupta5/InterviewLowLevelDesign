package Service.Payment;

import Model.Payment.Payment;

public class CreditCard implements PaymentStrategy {
    @Override
    public void makePayment(Payment payment) {
        System.out.println("Credit Card Payment is in Process : " + payment.toString());
    }
}
