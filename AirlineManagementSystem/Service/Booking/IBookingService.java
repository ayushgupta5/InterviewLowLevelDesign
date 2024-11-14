package Service.Booking;

import Model.Booking.Booking;
import Model.Payment.Payment;

public interface IBookingService {
    void makePayment(Payment payment);
    void cancel(Booking booking);
}
