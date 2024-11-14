package Service.Team;

import Model.Player.Player;
import Model.Team.Team;

public interface ITeamService {
    void getPlayers(Team team, Player player);
}
