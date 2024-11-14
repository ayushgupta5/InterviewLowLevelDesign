package Model.Team;

public class Team {
    private int teamID;
    private String teamName;
    private String country;

    public Team(int teamID, String teamName, String country) {
        this.teamID = teamID;
        this.teamName = teamName;
        this.country = country;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamID=" + teamID +
                ", teamName='" + teamName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
