package Service.ElevatorSystem;

import Model.ElevatorSystem.ElevatorSystem;

public class ElevatorSystemService implements IElevatorSystemService {
    @Override
    public void handleRequest(ElevatorSystem elevatorSystem) {
        System.out.println("Handling the Request : " + elevatorSystem.toString());
    }

    @Override
    public void assignElevator(ElevatorSystem elevatorSystem) {
        System.out.println("Assigning the Elevator : " + elevatorSystem.toString());
    }

    @Override
    public void manageQueue(ElevatorSystem elevatorSystem) {
        System.out.println("Managing the Queue : " + elevatorSystem.toString());
    }
}
