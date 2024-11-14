package Service.Admin;

import Model.Admin.Admin;
import Model.Course.Course;
import Model.User.User;

public interface IAdminService {
    void manageUsers(Admin admin, User user);
    void manageCourses(Admin admin, Course course);
}
