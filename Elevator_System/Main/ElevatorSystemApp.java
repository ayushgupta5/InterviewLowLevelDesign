package Main;

import Model.Elevator.Elevator;
import Model.ElevatorPanel.ElevatorPanel;
import Model.ElevatorSystem.ElevatorSystem;
import Model.FloorPanel.FloorPanel;
import Model.Request.Request;
import Service.Elevator.ElevatorService;
import Service.Elevator.IElevatorService;
import Service.ElevatorPanel.ElevatorPanelService;
import Service.ElevatorPanel.IElevatorPanelService;
import Service.ElevatorSystem.ElevatorSystemService;
import Service.ElevatorSystem.IElevatorSystemService;
import Service.FloorPanel.FloorPanelService;
import Service.FloorPanel.IFloorPanelService;
import Service.Request.IRequestService;
import Service.Request.RequestService;

public class ElevatorSystemApp {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(1, 1, "REST", "UP", 10);
        Request request = new Request(1, "UP", "UP");
        FloorPanel floorPanel = new FloorPanel(1);
        ElevatorPanel elevatorPanel = new ElevatorPanel(1);

        ElevatorSystem elevatorSystem = new ElevatorSystem();

        IElevatorService elevatorService = new ElevatorService();
        elevatorService.moveDown(elevator);
        elevatorService.moveUp(elevator);
        elevatorService.goToFloor(elevator);
        elevatorService.openDoor(elevator);
        elevatorService.closeDoor(elevator);

        IRequestService requestService = new RequestService();
        requestService.validateRequest(request);

        IFloorPanelService floorPanelService = new FloorPanelService();
        floorPanelService.requestElevator(floorPanel);

        IElevatorPanelService elevatorPanelService = new ElevatorPanelService();
        elevatorPanelService.selectFloor(elevatorPanel);

        IElevatorSystemService elevatorSystemService = new ElevatorSystemService();
        elevatorSystemService.assignElevator(elevatorSystem);
        elevatorSystemService.handleRequest(elevatorSystem);
        elevatorSystemService.manageQueue(elevatorSystem);
    }
}
