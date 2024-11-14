package Model.Match;

import Model.Team.Team;

import java.time.LocalDateTime;

public class Match {
    private int matchID;
    private Team team1;
    private Team team2;
    private String venue;
    private LocalDateTime date;
    private String status;

    public Match(int matchID, Team team1, Team team2, String venue, String status) {
        this.matchID = matchID;
        this.team1 = team1;
        this.team2 = team2;
        this.venue = venue;
        this.date = LocalDateTime.now();
        this.status = status;
    }

    public int getMatchID() {
        return matchID;
    }

    public void setMatchID(int matchID) {
        this.matchID = matchID;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchID=" + matchID +
                ", team1=" + team1 +
                ", team2=" + team2 +
                ", venue='" + venue + '\'' +
                ", date=" + date +
                ", status='" + status + '\'' +
                '}';
    }
}
