package Model.Scorecard;

import Model.Match.Match;
import Model.Team.Team;

public class ScoreCard {
    private int scorecardID;
    private Match match;
    private Team team;
    private int runs;
    private int wickets;
    private double overs;
    private String commentary;

    public ScoreCard(int scorecardID, Match match, Team team, int runs, int wickets, double overs, String commentary) {
        this.scorecardID = scorecardID;
        this.match = match;
        this.team = team;
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        this.commentary = commentary;
    }

    public int getScorecardID() {
        return scorecardID;
    }

    public void setScorecardID(int scorecardID) {
        this.scorecardID = scorecardID;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public double getOvers() {
        return overs;
    }

    public void setOvers(double overs) {
        this.overs = overs;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    @Override
    public String toString() {
        return "ScoreCard{" +
                "scorecardID=" + scorecardID +
                ", match=" + match +
                ", team=" + team +
                ", runs=" + runs +
                ", wickets=" + wickets +
                ", overs=" + overs +
                ", commentary='" + commentary + '\'' +
                '}';
    }
}
