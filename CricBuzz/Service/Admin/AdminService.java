package Service.Admin;

import Model.Admin.Admin;
import Model.Match.Match;
import Model.Player.Player;
import Model.Scorecard.ScoreCard;

public class AdminService implements IAdminService {
    @Override
    public void managePlayers(Admin admin, Player player) {
        System.out.println("Manage Players By Admin : " + admin.toString() + " Player: " + player.toString());
    }

    @Override
    public void manageMatches(Admin admin, Match match) {
        System.out.println("Manage Matches By Admin : " + admin.toString() + " Match: " + match.toString());
    }

    @Override
    public void updateLiveScores(Admin admin, ScoreCard scoreCard) {
        System.out.println("Update Live Score By Admin : " + admin.toString() + " ScoreCard: " + scoreCard.toString());
    }
}
