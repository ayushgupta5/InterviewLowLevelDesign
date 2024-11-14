package Main;

import Model.Contest.Contest;
import Model.Match.Match;
import Model.Payment.Payment;
import Model.Player.Player;
import Model.Team.Team;
import Model.User.User;
import Service.Contest.ContestService;
import Service.Contest.IContestService;
import Service.Match.IMatchService;
import Service.Match.MatchService;
import Service.Payment.CreditCard;
import Service.Payment.PaymentService;
import Service.Payment.PaymentStrategy;
import Service.Payment.UPI;
import Service.Player.IPlayerService;
import Service.Player.PlayerService;
import Service.Team.ITeamService;
import Service.Team.TeamService;
import Service.User.IUserService;
import Service.User.UserService;

public class Dream11App {
    public static void main(String[] args) {
        User user = new User(1, "Kohli", "111", 100.00);
        Match match = new Match(1, "Cricket", "startTime", "endTime");
        Contest contest = new Contest(1, match, 100.00, 100.00, "Cricket");
        Team team = new Team(1, user);
        Player player = new Player(1, "Kohli", "Batsman", "100");
        Payment payment = new Payment(1, 100.00, "UPI", user);

        IUserService userService = new UserService();
        userService.register();
        userService.login(user);

        IMatchService matchService = new MatchService();
        matchService.scheduleMatch(match);
        matchService.updateScore(match);

        IContestService contestService = new ContestService();
        contestService.calculateLeaderboard(contest);
        contestService.joinContest(contest);
        contestService.createContest(contest);

        ITeamService teamService = new TeamService();
        teamService.validateTeam(team);
        teamService.removePlayer(player);
        teamService.addPlayer(player);

        IPlayerService playerService = new PlayerService();
        playerService.getPoints(player);

        Payment(payment);

        payment.setTransactionType("CreditCard");
        Payment(payment);

        userService.logout(user);
    }

    private static void Payment(Payment payment) {
        PaymentStrategy paymentStrategy;
        if(payment.getTransactionType() == "UPI") {
            paymentStrategy = new UPI();
        } else {
            paymentStrategy = new CreditCard();
        }
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(paymentStrategy);
        paymentService.pay(payment);
    }
}
