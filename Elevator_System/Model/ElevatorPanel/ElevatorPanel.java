package Model.ElevatorPanel;

public class ElevatorPanel {
    private int elevatorID;

    public ElevatorPanel(int elevatorID) {
        this.elevatorID = elevatorID;
    }

    public int getElevatorID() {
        return elevatorID;
    }

    public void setElevatorID(int elevatorID) {
        this.elevatorID = elevatorID;
    }

    @Override
    public String toString() {
        return "ElevatorPanel{" +
                "elevatorID=" + elevatorID +
                '}';
    }
}
