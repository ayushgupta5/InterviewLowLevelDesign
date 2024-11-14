package Model.Enrollment;

import java.time.LocalDateTime;

public class Enrollment {
    // enrollmentId, status, date
    private int enrollmentID;
    private String status;
    private LocalDateTime date;

    public Enrollment(int enrollmentID, String status) {
        this.enrollmentID = enrollmentID;
        this.status = status;
        this.date = LocalDateTime.now();
    }

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollmentID=" + enrollmentID +
                ", status='" + status + '\'' +
                ", date=" + date +
                '}';
    }
}
