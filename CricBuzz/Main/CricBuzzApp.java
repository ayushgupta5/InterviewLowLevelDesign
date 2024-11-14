package Main;

import Model.Admin.Admin;
import Model.Match.Match;
import Model.Player.Player;
import Model.Scorecard.ScoreCard;
import Model.Team.Team;
import Model.User.User;
import Service.Admin.AdminService;
import Service.Admin.IAdminService;
import Service.Match.IMatchService;
import Service.Match.MatchService;
import Service.Player.IPlayerService;
import Service.Player.PlayerService;
import Service.Scorecard.IScoreCardService;
import Service.Scorecard.ScoreCardService;
import Service.Team.ITeamService;
import Service.Team.TeamService;
import Service.User.IUserService;
import Service.User.UserService;

public class CricBuzzApp {
    public static void main(String[] args) {
        User user = new User(1, "user", "user@gmail.com");
        Admin admin = new Admin(2, "Admin", "admin@gmail.com");
        Player player = new Player(1, "kohli", "35", "Batsman");
        Team team1 = new Team(1, "CSK", "INDIA");
        Team team2 = new Team(1, "RCB", "INDIA");
        Match match = new Match(1, team1, team2, "Kanpur", "Started");
        ScoreCard scoreCard = new ScoreCard(1, match, team1, 199, 4, 20.0, "Commentary");

        IUserService userService = new UserService();
        userService.searchMatches(user, match);
        userService.viewLiveScores(user, scoreCard);
        userService.viewPlayerStats(user, player);

        IAdminService adminService = new AdminService();
        adminService.manageMatches(admin, match);
        adminService.managePlayers(admin, player);
        adminService.updateLiveScores(admin, scoreCard);

        IPlayerService playerService = new PlayerService();
        playerService.getStatistics(player);

        ITeamService teamService = new TeamService();
        teamService.getPlayers(team1, player);
        teamService.getPlayers(team2, player);

        IMatchService matchService = new MatchService();
        matchService.createMatch("ODI", match);
        matchService.getScorecard(match);

        IScoreCardService scoreCardService = new ScoreCardService();
        scoreCardService.updateScore(scoreCard);
    }
}

