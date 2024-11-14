package Model.Employee;

import Model.Flight.Flight;

public class Employee {
    private int employeeID;
    private String name;
    private String role;
    private String assignedFlight;

    public Employee(int employeeID, String name, String role, String assignedFlight) {
        this.employeeID = employeeID;
        this.name = name;
        this.role = role;
        this.assignedFlight = assignedFlight;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAssignedFlight() {
        return assignedFlight;
    }

    public void setAssignedFlight(Flight assignedFlight) {
        this.assignedFlight = String.valueOf(assignedFlight);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", assignedFlight=" + assignedFlight +
                '}';
    }
}
