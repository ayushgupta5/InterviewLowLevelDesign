package Service.FloorPanel;

import Model.FloorPanel.FloorPanel;

public class FloorPanelService implements IFloorPanelService {
    @Override
    public void requestElevator(FloorPanel floorPanel) {
        System.out.println("Requesting the Elevator : " + floorPanel.toString());
    }
}
