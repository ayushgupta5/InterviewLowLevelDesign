package Service.ElevatorSystem;

import Model.ElevatorSystem.ElevatorSystem;

public interface IElevatorSystemService {
    void handleRequest(ElevatorSystem elevatorSystem);
    void assignElevator(ElevatorSystem elevatorSystem);
    void manageQueue(ElevatorSystem elevatorSystem);
}
