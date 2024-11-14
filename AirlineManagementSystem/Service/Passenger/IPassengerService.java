package Service.Passenger;

import Model.Booking.Booking;
import Model.Flight.Flight;
import Model.Passenger.Passenger;

public interface IPassengerService {
    void register(Passenger passenger);
    void bookFlight(Flight flight);
    void cancelBooking(Booking booking);
}
