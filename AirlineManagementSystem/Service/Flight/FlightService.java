package Service.Flight;

import Model.Flight.Flight;

public class FlightService implements IFlightService {
    @Override
    public void scheduleFlight(Flight flight) {
        System.out.println("Schedule the Flight : " +flight.toString());
    }

    @Override
    public void updateFlight(Flight flight) {
        System.out.println("Update the Flight : " +flight.toString());
    }
}
