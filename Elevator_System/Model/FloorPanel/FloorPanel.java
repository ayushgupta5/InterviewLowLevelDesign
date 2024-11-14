package Model.FloorPanel;

public class FloorPanel {
    private int floorNumber;

    public FloorPanel(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "FloorPanel{" +
                "floorNumber=" + floorNumber +
                '}';
    }
}
