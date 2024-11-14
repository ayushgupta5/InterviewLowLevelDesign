package Service.Course;

import Model.Course.Course;

public class CourseService implements ICourseService {
    @Override
    public void getDetails(Course course) {
        System.out.println("Get Details: " +course.toString());
    }

    @Override
    public void addPrerequisite(Course course) {
        System.out.println("Add Prerequisite: " +course.toString());
    }

    @Override
    public void setSchedule(Course course) {
        System.out.println("Set Schedule: " +course.toString());
    }
}
