package Model.Match;

public class Match {
    private int matchID;
    private String sportType;
    private String startTime;
    private String endTime;

    public Match(int matchID, String sportType, String startTime, String endTime) {
        this.matchID = matchID;
        this.sportType = sportType;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getMatchID() {
        return matchID;
    }

    public void setMatchID(int matchID) {
        this.matchID = matchID;
    }

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchID=" + matchID +
                ", sportType='" + sportType + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
