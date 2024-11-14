package Service.Faculty;

import Model.Course.Course;
import Model.Faculty.Faculty;

public class FacultyService implements IFacultyService {
    @Override
    public void createCourse(Faculty faculty, Course course) {
        System.out.println("Create Course: " +faculty.toString() + course.toString());
    }

    @Override
    public void updateCourse(Faculty faculty, Course course) {
        System.out.println("Update Course: " +faculty.toString() + course.toString());
    }

    @Override
    public void deleteCourse(Faculty faculty, Course course) {
        System.out.println("Delete Course: " +faculty.toString() + course.toString());
    }
}
