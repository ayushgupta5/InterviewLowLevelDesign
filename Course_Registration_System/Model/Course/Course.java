package Model.Course;

public class Course {
    private int courseID;
    private String courseName;
    private int capacity;

    public Course(int courseID, String courseName, int capacity) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.capacity = capacity;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
