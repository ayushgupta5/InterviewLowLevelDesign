package Model.Request;

public class Request {
    private int floorNumber;
    private String direction;
    private String type;

    public Request(int floorNumber, String direction, String type) {
        this.floorNumber = floorNumber;
        this.direction = direction;
        this.type = type;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Request{" +
                "floorNumber=" + floorNumber +
                ", direction='" + direction + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
