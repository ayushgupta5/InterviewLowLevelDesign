package Service.Flight;

import Model.Flight.Flight;

public interface IFlightService {
    void scheduleFlight(Flight flight);
    void updateFlight(Flight flight);
}
