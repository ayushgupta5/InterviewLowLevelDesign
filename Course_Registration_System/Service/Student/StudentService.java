package Service.Student;

import Model.Course.Course;
import Model.Student.Student;

public class StudentService implements IStudentService {
    @Override
    public void enrollCourse(Student student, Course course) {
        System.out.println("Enroll Course: " +student.toString() + course.toString());
    }

    @Override
    public void dropCourse(Student student, Course course) {
        System.out.println("Drop Course: " +student.toString() + course.toString());
    }

    @Override
    public void viewCourses(Student student, Course course) {
        System.out.println("View Course: " +student.toString() + course.toString());
    }
}
