package Service.Enrollment;

import Model.Enrollment.Enrollment;

public interface IEnrollmentService {
    void confirmEnrollment(Enrollment enrollment);
    void cancelEnrollment(Enrollment enrollment);
}
