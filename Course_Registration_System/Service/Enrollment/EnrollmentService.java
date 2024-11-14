package Service.Enrollment;

import Model.Enrollment.Enrollment;

public class EnrollmentService implements IEnrollmentService {
    @Override
    public void confirmEnrollment(Enrollment enrollment) {
        System.out.println("Confirm Enrollment: " +enrollment.toString());
    }

    @Override
    public void cancelEnrollment(Enrollment enrollment) {
        System.out.println("Cancel Enrollment: " +enrollment.toString());
    }
}
