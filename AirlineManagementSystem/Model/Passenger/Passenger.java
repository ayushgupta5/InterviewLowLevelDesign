package Model.Passenger;

public class Passenger {
    private int passengerID;
    private String name;
    private String email;
    private String phone;

    public Passenger(int passengerID, String name, String email, String phone) {
        this.passengerID = passengerID;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerID=" + passengerID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
