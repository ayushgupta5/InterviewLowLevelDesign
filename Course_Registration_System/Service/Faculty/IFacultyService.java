package Service.Faculty;

import Model.Course.Course;
import Model.Faculty.Faculty;

public interface IFacultyService {
    void createCourse(Faculty faculty, Course course);
    void updateCourse(Faculty faculty, Course course);
    void deleteCourse(Faculty faculty, Course course);
}
