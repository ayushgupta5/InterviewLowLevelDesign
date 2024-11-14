package Service.Booking;

import Model.Booking.Booking;

public interface IBookingService {
    void bookTicket(Booking booking);
    void cancelBooking(Booking booking);
}
