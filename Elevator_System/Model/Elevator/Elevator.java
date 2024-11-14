package Model.Elevator;

public class Elevator {
    private int id;
    private int currentFloor;
    private String status;
    private String direction;
    private int capacity;

    public Elevator(int id, int currentFloor, String status, String direction, int capacity) {
        this.id = id;
        this.currentFloor = currentFloor;
        this.status = status;
        this.direction = direction;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "id=" + id +
                ", currentFloor=" + currentFloor +
                ", status='" + status + '\'' +
                ", direction='" + direction + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
