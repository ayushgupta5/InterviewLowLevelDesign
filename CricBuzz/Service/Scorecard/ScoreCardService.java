package Service.Scorecard;

import Model.Scorecard.ScoreCard;

public class ScoreCardService implements IScoreCardService {
    @Override
    public void updateScore(ScoreCard scoreCard) {
        System.out.println("Updating the ScoreCard : " + scoreCard.toString());
    }
}
