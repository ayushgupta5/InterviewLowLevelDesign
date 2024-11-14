package Service.ElevatorPanel;

import Model.ElevatorPanel.ElevatorPanel;

public class ElevatorPanelService implements IElevatorPanelService {
    @Override
    public void selectFloor(ElevatorPanel elevatorPanel) {
        System.out.println("Selecting the Floor : " + elevatorPanel.toString());
    }
}
