package Model.Team;

import Model.User.User;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private int teamID;
    private User user;
    private List<String> players;

    public Team(int teamID, User user) {
        this.teamID = teamID;
        this.user = user;
        this.players = new ArrayList<>();
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<String> getPlayers() {
        return players;
    }

    public void setPlayers(List<String> players) {
        this.players = players;
    }
}
