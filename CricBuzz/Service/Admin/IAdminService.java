package Service.Admin;

import Model.Admin.Admin;
import Model.Match.Match;
import Model.Player.Player;
import Model.Scorecard.ScoreCard;

public interface IAdminService {
    void managePlayers(Admin admin, Player player);
    void manageMatches(Admin admin, Match match);
    void updateLiveScores(Admin admin, ScoreCard scoreCard);
}
