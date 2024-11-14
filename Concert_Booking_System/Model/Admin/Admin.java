package Model.Admin;

public class Admin {
    private int adminID;

    public Admin(int adminID) {
        this.adminID = adminID;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminID=" + adminID +
                '}';
    }
}
