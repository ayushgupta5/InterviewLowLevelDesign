package Service.Feedback;

import Model.Feedback.Feedback;

public class FeedbackService implements IFeedbackService {
    @Override
    public void leaveFeedback(Feedback feedback) {
        System.out.println("Leave the Feedback : " + feedback.toString());
    }
}
