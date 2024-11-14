package Service.Booking;

import Model.Booking.Booking;

public class BookingService implements IBookingService {
    @Override
    public void bookTicket(Booking booking) {
        System.out.println("Booking the Ticket: " +booking.toString());
    }

    @Override
    public void cancelBooking(Booking booking) {
        System.out.println("Cancel the Booking : " +booking.toString());
    }
}
