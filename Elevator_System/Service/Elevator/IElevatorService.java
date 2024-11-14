package Service.Elevator;

import Model.Elevator.Elevator;

public interface IElevatorService {
    void moveUp(Elevator elevator);
    void moveDown(Elevator elevator);
    void openDoor(Elevator elevator);
    void closeDoor(Elevator elevator);
    void goToFloor(Elevator elevator);
}
