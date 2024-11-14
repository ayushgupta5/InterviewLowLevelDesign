package Service.Admin;

import Model.Admin.Admin;

public interface IAdminService {
    void addCar(Admin admin);
    void updateCar(Admin admin);
    void removeCar(Admin admin);
}
