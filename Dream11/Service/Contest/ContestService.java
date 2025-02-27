package Service.Contest;

import Model.Contest.Contest;

public class ContestService implements IContestService {
    @Override
    public void createContest(Contest contest) {
        System.out.println("Creating the Contest : " +contest.toString());
    }

    @Override
    public void joinContest(Contest contest) {
        System.out.println("Joining the Contest : " +contest.toString());
    }

    @Override
    public void calculateLeaderboard(Contest contest) {
        System.out.println("Calculate Leaderboard : " +contest.toString());
    }
}
