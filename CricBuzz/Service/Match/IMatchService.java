package Service.Match;

import Model.Match.Match;

public interface IMatchService {
    void createMatch(String type, Match match);
    void getScorecard(Match match);
}
