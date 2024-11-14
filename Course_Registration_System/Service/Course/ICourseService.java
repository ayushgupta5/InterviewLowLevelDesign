package Service.Course;

import Model.Course.Course;

public interface ICourseService {
    void getDetails(Course course);
    void addPrerequisite(Course course);
    void setSchedule(Course course);
}
