package Service.Admin;

import Model.Admin.Admin;
import Model.Course.Course;
import Model.User.User;

public class AdminService implements IAdminService {
    @Override
    public void manageUsers(Admin admin, User user) {
        System.out.println("Manage Users : " +admin.toString() + user.toString());
    }

    @Override
    public void manageCourses(Admin admin, Course course) {
        System.out.println("Manage Courses : " +admin.toString() + course.toString());
    }
}
