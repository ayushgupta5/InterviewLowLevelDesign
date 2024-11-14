package Service.Admin;

import Model.Admin.Admin;
import Model.Concert.Concert;

public interface IAdminService {
    void addConcert(Admin admin, Concert concert);
    void removeConcert(Admin admin, Concert concert);
    void viewStatistics(Admin admin);
}
