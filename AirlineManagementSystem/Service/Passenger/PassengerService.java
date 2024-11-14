package Service.Passenger;

import Model.Booking.Booking;
import Model.Flight.Flight;
import Model.Passenger.Passenger;

public class PassengerService implements IPassengerService {
    @Override
    public void register(Passenger passenger) {
        System.out.println("Passenger is Registering : " +passenger.toString());
    }

    @Override
    public void bookFlight(Flight flight) {
        System.out.println("Booking the Flight : " +flight.toString());
    }

    @Override
    public void cancelBooking(Booking booking) {
        System.out.println("Cancelling the Booking : " +booking.toString());
    }
}
