package Service.Match;

import Model.Match.Match;

public class MatchService implements IMatchService {
    @Override
    public void createMatch(String type, Match match) {
        System.out.println("Create Match of : " + type + " Match: " + match.toString());
    }

    @Override
    public void getScorecard(Match match) {
        System.out.println("Getting the ScoreCard : " + match.toString());
    }
}
