package Main;

import Model.Admin.Admin;
import Model.Course.Course;
import Model.Enrollment.Enrollment;
import Model.Faculty.Faculty;
import Model.Notification.Notification;
import Model.Student.Student;
import Model.User.User;
import Service.Admin.AdminService;
import Service.Admin.IAdminService;
import Service.Course.CourseService;
import Service.Course.ICourseService;
import Service.Enrollment.EnrollmentService;
import Service.Enrollment.IEnrollmentService;
import Service.Faculty.FacultyService;
import Service.Faculty.IFacultyService;
import Service.Notification.INotificationService;
import Service.Notification.NotificationService;
import Service.Student.IStudentService;
import Service.Student.StudentService;
import Service.User.IUserService;
import Service.User.UserService;

public class CourseRegistrationSystemApp {
    public static void main(String[] args) {
        User user1 = new User(1, "Kohli", "kohli@gmail.com", "password");
        User user2 = new User(1, "rohit", "rohit@gmail.com", "password");
        Admin admin = new Admin(user1.getUserID(), user1.getName(), user1.getEmail(), user1.getPasswordHash(), 1);
        Student student = new Student(user2.getUserID(), user2.getName(), user2.getEmail(), user2.getPasswordHash(), 1);
        Course course = new Course(1, "DSA", 1);
        Faculty faculty = new Faculty(1, "Faculty", "faculty@gmail.com", "111", 1);
        Notification notification = new Notification("Awesome", "status", 1);
        Enrollment enrollment = new Enrollment(1, "status");

        IUserService userService = new UserService();
        userService.login(user1);
        userService.login(user2);

        IAdminService adminService = new AdminService();
        adminService.manageCourses(admin, course);
        adminService.manageUsers(admin, user2);
        adminService.manageUsers(admin, user1);

        IStudentService studentService = new StudentService();
        studentService.dropCourse(student, course);
        studentService.enrollCourse(student, course);
        studentService.viewCourses(student, course);

        ICourseService courseService = new CourseService();
        courseService.addPrerequisite(course);
        courseService.getDetails(course);
        courseService.setSchedule(course);

        IFacultyService facultyService = new FacultyService();
        facultyService.createCourse(faculty, course);
        facultyService.deleteCourse(faculty, course);
        facultyService.updateCourse(faculty, course);

        INotificationService notificationService = new NotificationService();
        notificationService.sendNotification(notification);
        notificationService.markAsRead(notification);

        IEnrollmentService enrollmentService = new EnrollmentService();
        enrollmentService.cancelEnrollment(enrollment);
        enrollmentService.confirmEnrollment(enrollment);


        userService.logout(user1);
        userService.logout(user2);
    }
}
