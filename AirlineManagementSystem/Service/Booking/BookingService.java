package Service.Booking;

import Model.Booking.Booking;
import Model.Payment.Payment;

public class BookingService implements IBookingService {
    @Override
    public void makePayment(Payment payment) {
        System.out.println("Making the Payment : " +payment.toString());
    }

    @Override
    public void cancel(Booking booking) {
        System.out.println("Cancelling the Booking : " +booking.toString());
    }
}
