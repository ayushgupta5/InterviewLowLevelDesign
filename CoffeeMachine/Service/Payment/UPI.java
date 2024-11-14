package Service.Payment;

import Model.Payment.Payment;

public class UPI implements PaymentStrategy {
    @Override
    public void makePayment(Payment payment) {
        System.out.println("UPI Payment is in Process : " + payment.toString());
    }
}
