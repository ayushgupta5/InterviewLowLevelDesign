package Service.Admin;

import Model.Admin.Admin;

public class AdminService implements IAdminService {
    @Override
    public void addCar(Admin admin) {
        System.out.println("Admin is Adding the Car : " + admin.toString());
    }

    @Override
    public void updateCar(Admin admin) {
        System.out.println("Admin is Updating the Car : " + admin.toString());
    }

    @Override
    public void removeCar(Admin admin) {
        System.out.println("Admin is Removing the car : " + admin.toString());
    }
}
