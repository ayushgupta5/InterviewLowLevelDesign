package Service.User;

import Model.Match.Match;
import Model.Player.Player;
import Model.Scorecard.ScoreCard;
import Model.User.User;

public class UserService implements IUserService {
    @Override
    public void viewLiveScores(User user, ScoreCard scoreCard) {
        System.out.println("Viewing the Live Scores by User: " + user.toString() + " ScoreCard : " + scoreCard.toString());
    }

    @Override
    public void viewPlayerStats(User user, Player player) {
        System.out.println("Viewing the Player Stats by User: " + user.toString() + " Player : " + player.toString());
    }

    @Override
    public void searchMatches(User user, Match match) {
        System.out.println("Searching the Match by User: " + user.toString() + " Match : " + match.toString());
    }
}
