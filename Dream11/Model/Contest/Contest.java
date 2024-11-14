package Model.Contest;

import Model.Match.Match;

public class Contest {
    private int contestID;
    private Match match;
    private double entryFee;
    private double prizePool;
    private String contestType;

    public Contest(int contestID, Match match, double entryFee, double prizePool, String contestType) {
        this.contestID = contestID;
        this.match = match;
        this.entryFee = entryFee;
        this.prizePool = prizePool;
        this.contestType = contestType;
    }

    public int getContestID() {
        return contestID;
    }

    public void setContestID(int contestID) {
        this.contestID = contestID;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public double getPrizePool() {
        return prizePool;
    }

    public void setPrizePool(double prizePool) {
        this.prizePool = prizePool;
    }

    public String getContestType() {
        return contestType;
    }

    public void setContestType(String contestType) {
        this.contestType = contestType;
    }

    @Override
    public String toString() {
        return "Contest{" +
                "contestID=" + contestID +
                ", match=" + match +
                ", entryFee=" + entryFee +
                ", prizePool=" + prizePool +
                ", contestType='" + contestType + '\'' +
                '}';
    }
}
