package Service.User;

import Model.Match.Match;
import Model.Player.Player;
import Model.Scorecard.ScoreCard;
import Model.User.User;

public interface IUserService {
    void viewLiveScores(User user, ScoreCard scoreCard);
    void viewPlayerStats(User user, Player player);
    void searchMatches(User user, Match match);
}
