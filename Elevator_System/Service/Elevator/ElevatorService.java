package Service.Elevator;

import Model.Elevator.Elevator;

public class ElevatorService implements IElevatorService {
    @Override
    public void moveUp(Elevator elevator) {
        System.out.println("Moving Up : " + elevator.toString());
    }

    @Override
    public void moveDown(Elevator elevator) {
        System.out.println("Moving Down : " + elevator.toString());
    }

    @Override
    public void openDoor(Elevator elevator) {
        System.out.println("Open the Door : " + elevator.toString());
    }

    @Override
    public void closeDoor(Elevator elevator) {
        System.out.println("Closing the Door : " + elevator.toString());
    }

    @Override
    public void goToFloor(Elevator elevator) {
        System.out.println("Going to the Floor : " + elevator.toString());
    }
}
