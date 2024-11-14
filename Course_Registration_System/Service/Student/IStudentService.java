package Service.Student;

import Model.Course.Course;
import Model.Student.Student;

public interface IStudentService {
    void enrollCourse(Student student, Course course);
    void dropCourse(Student student, Course course);
    void viewCourses(Student student, Course course);
}
