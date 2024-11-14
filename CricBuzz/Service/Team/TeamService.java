package Service.Team;

import Model.Player.Player;
import Model.Team.Team;

public class TeamService implements ITeamService {
    @Override
    public void getPlayers(Team team, Player player) {
        System.out.println("Getting the Players of Team : " + team.toString() + " Player: " + player.toString());
    }
}
