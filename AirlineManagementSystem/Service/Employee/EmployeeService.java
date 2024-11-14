package Service.Employee;

import Model.Flight.Flight;

public class EmployeeService implements IEmployeeService {
    @Override
    public void assignFlight(Flight flight) {
        System.out.println("Assigning the Flight : " +flight.toString());
    }

    @Override
    public void manageCheckIn() {
        System.out.println("Manage Checking ");
    }
}
