package Service.Admin;

import Model.Admin.Admin;
import Model.Concert.Concert;

public class AdminService implements IAdminService {
    @Override
    public void addConcert(Admin admin, Concert concert) {
        System.out.println("Adding the Concert: " + concert.toString());
    }

    @Override
    public void removeConcert(Admin admin, Concert concert) {
        System.out.println("Removing the Concert: " +concert.toString() + " Admin: " +admin.toString());
    }

    @Override
    public void viewStatistics(Admin admin) {
        System.out.println("Viewing the Statistics: " + admin.toString());
    }
}
