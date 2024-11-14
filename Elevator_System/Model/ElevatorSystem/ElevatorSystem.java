package Model.ElevatorSystem;

import Model.Elevator.Elevator;
import Model.Request.Request;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {
    List<Elevator> listOfElevators;
    List<Request> requestQueue;

    public ElevatorSystem() {
        this.listOfElevators = new ArrayList<>();
        this.requestQueue = new ArrayList<>();
    }

    public List<Elevator> getListOfElevators() {
        return listOfElevators;
    }

    public void setListOfElevators(List<Elevator> listOfElevators) {
        this.listOfElevators = listOfElevators;
    }

    public List<Request> getRequestQueue() {
        return requestQueue;
    }

    public void setRequestQueue(List<Request> requestQueue) {
        this.requestQueue = requestQueue;
    }

    @Override
    public String toString() {
        return "ElevatorSystem{" +
                "listOfElevators=" + listOfElevators +
                ", requestQueue=" + requestQueue +
                '}';
    }
}
